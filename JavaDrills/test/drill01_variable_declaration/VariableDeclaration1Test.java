package drill01_variable_declaration;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class VariableDeclaration1Test {

    @Test
    public void testOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        VariableDeclaration1.main(null);

        String expected = "5" + System.lineSeparator();
        String actual = out.toString();

        assertEquals(expected, actual,
            "\n❌ 出力が正しくありません。\n" +
            "👉 期待された出力: " + expected +
            "👉 実際の出力:     " + actual + "\n"
        );
    }

    @Test
    public void testDeclarationAssignmentPrint() throws Exception {
        String path = "src/drill01_variable_declaration/VariableDeclaration1.java";
        String source = DrillCodeChecker.readSource(path);

        String varName = DrillCodeChecker.findDeclaredVariable(source, "int");

        DrillCodeChecker.assertPrintedVariable(source, varName);
    }
}
