package drill05_switch;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

public class Switch4Test {

	@Test
	public void testOutputRed() throws Exception {
		testWithValue("赤", "Red");
	}

	@Test
	public void testOutputBlue() throws Exception {
		testWithValue("青", "Blue");
	}

	@Test
	public void testOutputYellow() throws Exception {
		testWithValue("黄", "Yellow");
	}

	@Test
	public void testOutputGreen() throws Exception {
		testWithValue("緑", "Other");
	}

	@Test
	public void testSwitchUsed() throws Exception {
		SourceCodeAssert.assertSwitchUsed(getClass());
	}

	private void testWithValue(String color, String expected) throws Exception {
		SourceCodeAssert.assertOutputMatches(getClass(), "color", "\"" + color + "\"", expected);
	}
}
