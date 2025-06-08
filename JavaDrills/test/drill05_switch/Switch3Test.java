package drill05_switch;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

public class Switch3Test {

	@Test
	public void testOutput1() throws Exception {
		testWithValue(1, "ON");
	}

	@Test
	public void testOutput2() throws Exception {
		testWithValue(2, "OFF");
	}

	@Test
	public void testOutput9() throws Exception {
		testWithValue(9, "UNKNOWN");
	}

	@Test
	public void testSwitchUsed() throws Exception {
		SourceCodeAssert.assertSwitchUsed(getClass());
	}

	private void testWithValue(int number, String expected) throws Exception {
		SourceCodeAssert.assertOutputMatches(getClass(), "number", number, expected);
	}
}
