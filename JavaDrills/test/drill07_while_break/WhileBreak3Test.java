package drill07_while_break;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

public class WhileBreak3Test {

	@Test
	public void testOutput() throws Exception {
		String expected = String.join(System.lineSeparator(),
			"★",
			"★★",
			"★★★",
			"★★★★"
		);
		SourceCodeAssert.assertOutputMatches(getClass(), expected);
	}

	@Test
	public void testIfUsed() throws Exception {
		SourceCodeAssert.assertIfUsed(getClass());
	}

	@Test
	public void testBreakUsed() throws Exception {
		SourceCodeAssert.assertBreakUsed(getClass());
	}
}
