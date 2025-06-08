package drill06_while;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

public class While4Test {

	@Test
	public void testOutput() throws Exception {
		String expected = String.join(System.lineSeparator(),
				"現在 1 回目です",
				"現在 2 回目です",
				"現在 3 回目です");
		SourceCodeAssert.assertOutputMatches(getClass(), expected);
	}

	@Test
	public void testWhileUsed() throws Exception {
		SourceCodeAssert.assertWhileUsed(getClass());
	}
}
