package drill00_output;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class Output2Test {
    @Test
    public void testOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Output2.main(null);

        String expected = "おはようございます。\n今日もがんばりましょう。\n";
        String actual = out.toString();

        assertEquals(expected, actual,
            "\n❌ 出力が正しくありません。\n" +
            "👉 期待された出力:\n" + expected +
            "👉 実際の出力:\n" + actual +
            "※ 改行や句読点の違いに注意しましょう。\n"
        );
    }
}
