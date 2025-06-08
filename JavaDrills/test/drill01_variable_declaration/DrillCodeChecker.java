package drill01_variable_declaration;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import utils.SourceReader;


class DrillCodeChecker {

    static String readSource(String path) throws IOException {
        return SourceReader.readSource(path);
    }

    static String findDeclaredVariable(String source, String type) {
        Matcher matcher = Pattern.compile(type + "\\s+(\\w+)\\s*;").matcher(source);
        if (!matcher.find()) {
            fail("❌ " + type + " 型の変数の宣言が見つかりません。");
        }
        return matcher.group(1);
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
