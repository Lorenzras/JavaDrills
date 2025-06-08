package drill03_ifelse;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import utils.SourceReader;

public class IfElse1Test {

	@Test
	public void testOutput() throws Exception {
		// 読み取り対象のファイル
		String source = SourceReader.readSource("src/drill03_ifelse/IfElse1.java");

		// score の値を抽出する
		Matcher matcher = Pattern.compile("int\\s+score\\s*=\\s*(\\d+)\\s*;").matcher(source);
		assertTrue(matcher.find(), "❌ score の初期化が見つかりません。");

		int score = Integer.parseInt(matcher.group(1));
		String expected = (score >= 60) ? "合格" : "不合格";

		// 実行と出力の取得
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		IfElse1.main(null);
		String actual = out.toString().trim();

		assertEquals(expected, actual, "score = " + score + " のとき「" + expected + "」と出力される必要があります。");
	}

	@Test
	public void testIfElseUsed() throws IOException {
		String source = SourceReader.readSource("src/drill03_ifelse/IfElse1.java");

		boolean hasIf = Pattern.compile("\\bif\\b").matcher(source).find();
		boolean hasElse = Pattern.compile("\\belse\\b").matcher(source).find();

		assertTrue(hasIf && hasElse, "❌ if と else の両方を使用してください。");
	}

	@Test
	public void testContainsExpectedWords() throws IOException {
		String source = SourceReader.readSource("src/drill03_ifelse/IfElse1.java");

		assertTrue(source.contains("合格"), "❌ ソースコード内に「合格」が含まれていません。");
		assertTrue(source.contains("不合格"), "❌ ソースコード内に「不合格」が含まれていません。");
	}

}