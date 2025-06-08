package drill08_continue;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

public class Continue1Test {

	@Test
	public void testOutput() throws Exception {
		String expected = String.join(System.lineSeparator(),
				"0",
				"1",
				"2",
				"4",
				"5",
				"6",
				"7",
				"8",
				"9",
				"10");
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
}
