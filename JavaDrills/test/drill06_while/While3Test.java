package drill06_while;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

public class While3Test {

	@Test
	public void testOutput() throws Exception {
		String expected = "★★★";
		SourceCodeAssert.assertOutputMatches(getClass(), expected);
	}

	@Test
	public void testDoWhileUsed() throws Exception {
		SourceCodeAssert.assertDoWhileUsed(getClass());
	}
}
