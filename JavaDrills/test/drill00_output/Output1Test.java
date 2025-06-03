package drill00_output;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class Output1Test {
    @Test
    public void testOutput() {
        // キャプチャ設定
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // 実行
        Output1.main(null);

        // 出力取得
        String actual = out.toString();

        // 改行あり／なしの2パターンどちらか一致すればOK
        boolean matchNoNewline = actual.equals("こんにちは、世界！");
        boolean matchWithNewline = actual.equals("こんにちは、世界！" + System.lineSeparator()) ;

        assertTrue(matchNoNewline || matchWithNewline,
            "\n❌ 出力が正しくありません。\n" +
            "👉 正しい出力: こんにちは、世界！ \n" +
            "👉 実際の出力: " + actual + "\n" +
            "※ 文言のミス、余計な空白や記号がないか確認してください。\n"
        );
    }
}
