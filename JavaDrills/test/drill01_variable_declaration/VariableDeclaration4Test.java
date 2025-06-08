package drill01_variable_declaration;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class VariableDeclaration4Test {

    @Test
    public void testOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        VariableDeclaration4.main(null);

        String expected = "太郎" + System.lineSeparator();
        String actual = out.toString();

        assertEquals(expected, actual,
            "\n❌ 出力が正しくありません。\n" +
            "👉 期待された出力: " + expected +
            "👉 実際の出力:     " + actual + "\n"
        );
    }

    @Test
    public void testDeclarationAndPrint() throws Exception {
        String path = "src/drill01_variable_declaration/VariableDeclaration4.java";
        String source = DrillCodeChecker.readSource(path);

        String varName = DrillCodeChecker.findDeclaredVariable(source, "String");
        DrillCodeChecker.assertPrintedVariable(source, varName);
    }
}
