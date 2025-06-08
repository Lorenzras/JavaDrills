package drill02_variable_initialization;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import utils.SourceReader;

class DrillCodeChecker {

	static String readSource(String path) throws IOException {
		return SourceReader.readSource(path);
	}

	static String findVariableInitialization(String source, String type) {
		// e.g., int year = ...;
		Pattern pattern = Pattern.compile(type + "\\s+(\\w+)\\s*=\\s*[^;]+;");
		Matcher matcher = pattern.matcher(source);

		assertTrue(matcher.find(),
				"\n❌ " + type + " 型の変数が 1 行で初期化されていません。\n" +
						"💡 宣言と代入を 1 行で書く必要があります（例: int x = ...;）。\n");

		return matcher.group(1);
	}

	static void assertPrintedVariable(String source, String varName) {
		Pattern pattern = Pattern.compile("System\\.out\\.println\\(\\s*" + varName + "\\s*\\)");
		Matcher matcher = pattern.matcher(source);

		assertTrue(matcher.find(),
				"\n❌ System.out.println に変数を使っていません。\n" +
						"💡 宣言した変数を使って出力してください。\n");
	}
}
