package drill08_for_continue;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

public class ForContinue3Test {

	@Test
	public void testOutput() throws Exception {
		String expected = String.join(System.lineSeparator(),
				"1",
				"3",
				"5",
				"7",
				"9");
		SourceCodeAssert.assertOutputMatches(getClass(), expected);
	}

	@Test
	public void testIfUsed() throws Exception {
		SourceCodeAssert.assertIfUsed(getClass());
	}

	@Test
	public void testContinueUsed() throws Exception {
		SourceCodeAssert.assertContinueUsed(getClass());
	}

	@Test
	public void testForUsed() throws Exception {
		SourceCodeAssert.assertForUsed(getClass());
	}
}
