package drill01_variable_declaration;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class VariableDeclaration5Test {

	@Test
	public void testOutput() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		VariableDeclaration5.main(null);

		String expected = "A" + System.lineSeparator();
		String actual = out.toString();

		assertEquals(expected, actual,
				"\n❌ 出力が正しくありません。\n" +
						"👉 期待された出力: " + expected +
						"👉 実際の出力:     " + actual + "\n");
	}

	@Test
	public void testDeclarationAndPrint() throws Exception {
		String path = "src/drill01_variable_declaration/VariableDeclaration5.java";
		String source = DrillCodeChecker.readSource(path);

		String varName = DrillCodeChecker.findDeclaredVariable(source, "char");
		DrillCodeChecker.assertPrintedVariable(source, varName);
	}
}
