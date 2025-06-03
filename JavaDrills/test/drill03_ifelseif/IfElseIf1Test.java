package drill03_ifelseif;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class IfElseIf1Test {
    @Test
    public void testOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        IfElseIf1.main(null);

        String expected = "満点" + System.lineSeparator();
        String actual = out.toString();

        assertEquals(expected, actual,
            "\n❌ 出力が正しくありません。\n" +
            "👉 期待された出力: " + expected +
            "👉 実際の出力:     " + actual + "\n" +
            "※ if-else if 文の条件分岐が正しく書けているか確認しましょう。\n"
        );
    }
}