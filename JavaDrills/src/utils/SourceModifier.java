package utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Javaソースコードを加工・保存するユーティリティクラスです。
 * クラス名や変数の初期値を書き換えた一時ファイルを生成する用途で使用されます。
 */
public class SourceModifier {

	/**
	 * 指定された変数の値を変更し、クラス名も変更したソースファイルを新たに生成します。
	 *
	 * @param originalPathStr 元のソースファイルのパス
	 * @param oldClassName    元のクラス名
	 * @param newClassName    新しいクラス名（ファイル名にも使用）
	 * @param varName         変更対象の変数名
	 * @param newValue        変更後の変数の値
	 * @return 生成された一時ファイルのパス
	 * @throws IOException ファイル読み込み・書き込みエラー
	 */
	public static Path modifyVariable(String originalPathStr, String oldClassName, String newClassName,
			String varName, String newValue) throws IOException {
		Path originalPath = Paths.get(originalPathStr);
		String source = readOriginalSource(originalPath);

		String modifiedSource = replaceClassName(source, oldClassName, newClassName);
		modifiedSource = replaceVariableValue(modifiedSource, varName, newValue);

		Path modifiedPath = originalPath.getParent().resolve(newClassName + ".java");
		writeToFile(modifiedPath, modifiedSource);

		return modifiedPath;
	}

	/**
	 * クラス名のみを変更し、ソースコードをそのままコピーします。
	 *
	 * @param originalPathStr 元のソースファイルのパス
	 * @param oldClassName    元のクラス名
	 * @param newClassName    新しいクラス名（ファイル名にも使用）
	 * @return 生成された一時ファイルのパス
	 * @throws IOException ファイル読み込み・書き込みエラー
	 */
	public static Path copyWithoutModification(String originalPathStr, String oldClassName, String newClassName)
			throws IOException {
		Path originalPath = Paths.get(originalPathStr);
		String source = readOriginalSource(originalPath);

		String modifiedSource = replaceClassName(source, oldClassName, newClassName);
		Path copiedPath = originalPath.getParent().resolve(newClassName + ".java");

		writeToFile(copiedPath, modifiedSource);
		return copiedPath;
	}

	/**
	 * ソースコードファイルの内容を読み込みます。
	 *
	 * @param path ファイルパス
	 * @return ソースコード（文字列）
	 * @throws IOException 読み込み失敗時
	 */
	public static String readOriginalSource(Path path) throws IOException {
		return new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
	}

	/**
	 * クラス名を変更します。
	 *
	 * @param source    元のソースコード
	 * @param oldClass  変更前のクラス名
	 * @param newClass  変更後のクラス名
	 * @return クラス名を書き換えたソースコード
	 */
	public static String replaceClassName(String source, String oldClass, String newClass) {
		return source.replaceAll("public\\s+class\\s+" + oldClass, "public class " + newClass);
	}

	/**
	 * 指定した変数の初期値を変更します。
	 *
	 * @param source    ソースコード
	 * @param varName   変数名
	 * @param newValue  新しい値
	 * @return 変数値を書き換えたソースコード
	 */
	public static String replaceVariableValue(String source, String varName, String newValue) {
		return source.replaceFirst(varName + "\\s*=\\s*[^;]+;", varName + " = " + newValue + ";");
	}

	/**
	 * 指定されたパスに内容を書き込みます。
	 *
	 * @param path    書き込み先ファイル
	 * @param content 書き込む内容
	 * @throws IOException 書き込み失敗時
	 */
	public static void writeToFile(Path path, String content) throws IOException {
		Files.write(path, content.getBytes(StandardCharsets.UTF_8));
	}
}
