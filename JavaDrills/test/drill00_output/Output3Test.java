package drill00_output;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class Output3Test {
    @Test
    public void testFlexibleSelfIntro() {
        // 標準出力をキャプチャ
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Output3 を実行
        Output3.main(null);

        // 出力を行ごとに分割
        String[] lines = out.toString().split("\r?\n");

        // 行数チェック（4行であること）
        assertEquals(4, lines.length,
            "\n❌ 出力は4行にしてください。\n" +
            "👉 現在の行数: " + lines.length + "行\n"
        );

        // 各行が空でないことをチェック
        for (int i = 0; i < lines.length; i++) {
            assertFalse(lines[i].trim().isEmpty(),
                "\n❌ " + (i + 1) + "行目が空です。\n" +
                "👉 自己紹介の各行に内容を書いてください。\n"
            );
        }
    }
}
