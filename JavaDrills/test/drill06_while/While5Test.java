package drill06_while;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

public class While5Test {

	@Test
	public void testOutput() throws Exception {
		String expected = String.join(System.lineSeparator(),
			"カウント:1",
			"カウント:2",
			"カウント:3"
		);
		SourceCodeAssert.assertOutputMatches(getClass(), expected);
	}

	@Test
	public void testDoWhileUsed() throws Exception {
		SourceCodeAssert.assertDoWhileUsed(getClass());
	}
}
