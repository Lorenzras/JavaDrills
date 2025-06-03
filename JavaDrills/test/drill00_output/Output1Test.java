package drill00_output;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class Output1Test {
    @Test
    public void testOutput() {
        // 標準出力をキャプチャするための準備
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // テスト対象クラスのmainメソッドを実行
        Output1.main(null);

        // 改行を考慮して比較
        String expected = "こんにちは、世界！";
        String actual = out.toString();

        // 比較し、エラーメッセージを日本語で表示
        assertEquals(expected, actual,
            "\n❌ 出力が正しくありません。\n " +
            "👉 期待された出力: " + expected + "\n" +
            "👉 実際の出力:     " + actual + "\n"
        );
    }
}
