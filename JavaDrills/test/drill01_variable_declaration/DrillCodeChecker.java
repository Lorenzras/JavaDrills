package drill01_variable_declaration;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class DrillCodeChecker {

    static String readSource(String path) throws IOException {
        String source = new String(Files.readAllBytes(Paths.get(path)), "UTF-8");
        return source.replaceAll("(?s)/\\*.*?\\*/", "")
                     .replaceAll("//.*", "")
                     .replaceAll("\\s+", " ");
    }

    static String findDeclaredVariable(String source, String type) {
        Matcher matcher = Pattern.compile(type + "\\s+(\\w+)\\s*;").matcher(source);
        if (!matcher.find()) {
            fail("❌ " + type + " 型の変数の宣言が見つかりません。");
        }
        return matcher.group(1);
    }

    static void assertAssignment(String source, String varName, String value) {
        Pattern pattern = Pattern.compile(varName + "\\s*=\\s*" + value + "\\s*;");
        Matcher matcher = pattern.matcher(source);
        assertTrue(matcher.find(),
            "\n❌ 変数の宣言のあとに、代入（" + varName + " = " + value + ";）をしてください。\n" +
            "💡 宣言と代入の違いを理解するために、1行にまとめず分けて書いてください。\n"
        );
    }

    static void assertPrintedVariable(String source, String varName) {
        Pattern pattern = Pattern.compile("System\\.out\\.println\\(\\s*" + varName + "\\s*\\)");
        Matcher matcher = pattern.matcher(source);
        assertTrue(matcher.find(),
            "\n❌ System.out.println に変数を使っていません。\n" +
            "💡 宣言した変数を使って出力してください。\n"
        );
    }
}
