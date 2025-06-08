package drill02_variable_initialization;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class VariableInitialization1Test {

    @Test
    public void testOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        VariableInitialization1.main(null);

        String expected = "2025" + System.lineSeparator();
        String actual = out.toString();

        assertEquals(expected, actual,
            "\n❌ 出力が正しくありません。\n" +
            "👉 期待された出力: " + expected +
            "👉 実際の出力:     " + actual + "\n"
        );
    }

    @Test
    public void testInitializationAndPrint() throws Exception {
        String path = "src/drill02_variable_initialization/VariableInitialization1.java";
        String source = DrillCodeChecker.readSource(path);

        String varName = DrillCodeChecker.findVariableInitialization(source, "int");

        DrillCodeChecker.assertPrintedVariable(source, varName);
    }
}
