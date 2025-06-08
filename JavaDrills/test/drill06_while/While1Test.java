package drill06_while;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

public class While1Test {

	@Test
	public void testOutput() throws Exception {
		String expected = String.join(System.lineSeparator(),
			"Hello!",
			"Hello!",
			"Hello!",
			"Hello!",
			"Hello!"
		);
		SourceCodeAssert.assertOutputMatches(getClass(), expected);
	}

	@Test
	public void testWhileUsed() throws Exception {
		SourceCodeAssert.assertWhileUsed(getClass());
	}
}
