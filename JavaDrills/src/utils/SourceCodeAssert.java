// OutputAssertUtil.java (moved and renamed from IfElseTestUtil)
package utils;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Path;
import java.util.regex.Pattern;

/**
 * 出力内容や文法の使用有無を検証するユーティリティクラスです。
 * 主に Java 学習ドリルのJUnitテストで使用されます。
 */
public class SourceCodeAssert {

	/**
	 * ソースコード内に if と else の両方が使用されていることを検証します。
	 *
	 * @param source 対象のソースコード（文字列）
	 */
	public static void assertIfElseUsed(String source) {
		boolean hasIf = Pattern.compile("\\bif\\b").matcher(source).find();
		boolean hasElse = Pattern.compile("\\belse\\b").matcher(source).find();
		assertTrue(hasIf && hasElse, "❌ if と else の両方を使用してください。");
	}

	/**
	 * テストクラスに対応するソースコードを読み込み、
	 * if と else の両方が使用されていることを検証します。
	 *
	 * @param testClass 対象のテストクラス
	 * @throws IOException ファイル読み込みエラー
	 */
	public static void assertIfElseUsed(Class<?> testClass) throws IOException {
		final String sourcePath = TestMetaUtil.getSourcePath(testClass);
		String source = SourceReader.readSource(sourcePath);
		assertIfElseUsed(source);
	}

	/**
	* テストクラスに対応するソースコードを読み込み、
	* switch 文が使用されていることを検証します。
	*
	* @param testClass 対象のテストクラス
	* @throws IOException ファイル読み込みエラー
	*/
	public static void assertSwitchUsed(Class<?> testClass) throws IOException {
		final String sourcePath = TestMetaUtil.getSourcePath(testClass);
		String source = SourceReader.readSource(sourcePath);
		boolean hasSwitch = Pattern.compile("\\bswitch\\b").matcher(source).find();
		assertTrue(hasSwitch, "❌ switch 文を使用してください。");
	}

	/**
	 * テストクラスに対応するソースコードを読み込み、
	 * while 文が使用されていることを検証します。
	 *
	 * @param testClass 対象のテストクラス
	 * @throws IOException ファイル読み込みエラー
	 */
	public static void assertWhileUsed(Class<?> testClass) throws IOException {
		final String sourcePath = TestMetaUtil.getSourcePath(testClass);
		String source = SourceReader.readSource(sourcePath);
		boolean hasWhile = Pattern.compile("\\bwhile\\b").matcher(source).find();
		assertTrue(hasWhile, "❌ while 文を使用してください。");
	}

	/**
	 * 指定した変数の値を一時的に変更してソースを実行し、期待される出力と一致するかを検証します。
	 * すべてのプリミティブ型や文字列（String.valueOf で変換）に対応しています。
	 *
	 * @param testClass テストクラス
	 * @param variableName 変更する変数名
	 * @param value 変更後の値
	 * @param expected 期待される出力
	 * @throws Exception 実行時例外
	 */
	public static void assertOutputMatches(Class<?> testClass, String variableName, Object value, String expected)
			throws Exception {
		String className = TestMetaUtil.getBaseClassName(testClass);
		String packageName = TestMetaUtil.getPackageName(testClass);
		String sourcePath = TestMetaUtil.getSourcePath(testClass);
		String tempClassName = TestMetaUtil.getTempClassName(testClass);

		Path modified = SourceModifier.modifyVariable(
				sourcePath, className, tempClassName, variableName, String.valueOf(value));

		try {
			JavaRunnerUtil.compile(modified);
			String output = JavaRunnerUtil.run(packageName, tempClassName);
			assertEquals(expected, output, variableName + " = " + value + " のとき「" + expected + "」と出力される必要があります。");
		} finally {
			JavaRunnerUtil.cleanUp(modified);
		}
	}

	/**
	 * テストクラスに対応するソースコードを実行し、出力が期待される文字列と一致するかを検証します。
	 *
	 * @param testClass 対象のテストクラス
	 * @param expectedOutput 期待される出力（複数行も可）
	 * @throws Exception コンパイルまたは実行エラー
	 */
	public static void assertOutputMatches(Class<?> testClass, String expectedOutput) throws Exception {
		String className = TestMetaUtil.getBaseClassName(testClass);
		String packageName = TestMetaUtil.getPackageName(testClass);
		String sourcePath = TestMetaUtil.getSourcePath(testClass);
		String tempClassName = TestMetaUtil.getTempClassName(testClass);

		Path copied = SourceModifier.copyWithoutModification(sourcePath, className, tempClassName);

		try {
			JavaRunnerUtil.compile(copied);
			String output = JavaRunnerUtil.run(packageName, tempClassName);
			assertEquals(expectedOutput.trim(), output.trim(), "❌ 出力が期待と一致しません。");
		} finally {
			JavaRunnerUtil.cleanUp(copied);
		}
	}

	/**
	 * ソースコード内に指定されたキーワードが含まれているかを検証します。
	 *
	 * @param source ソースコード
	 * @param expectedWords 検証対象のキーワード
	 */
	public static void assertContainsWords(String source, String... expectedWords) {
		for (String word : expectedWords) {
			assertTrue(source.contains(word), "❌ ソースコード内に「" + word + "」が含まれていません。");
		}
	}

	/**
	 * テストクラスに対応するソースコード内に、指定されたキーワードが含まれているかを検証します。
	 *
	 * @param testClass 対象のテストクラス
	 * @param expectedWords 検証対象のキーワード
	 * @throws IOException 読み込み失敗時
	 */
	public static void assertContainsWords(Class<?> testClass, String... expectedWords) throws IOException {
		String sourcePath = TestMetaUtil.getSourcePath(testClass);
		String source = SourceReader.readSource(sourcePath);
		assertContainsWords(source, expectedWords);
	}
}
