package drill04_ifelseif;

import org.junit.jupiter.api.Test;

public class IfElseIf5Test {

	@Test
	public void testOutput49() throws Exception {
		testWithValue(49, "C ランク");
	}

	@Test
	public void testOutput50() throws Exception {
		testWithValue(50, "B ランク");
	}

	@Test
	public void testOutput69() throws Exception {
		testWithValue(69, "B ランク");
	}

	@Test
	public void testOutput70() throws Exception {
		testWithValue(70, "A ランク");
	}

	@Test
	public void testOutput89() throws Exception {
		testWithValue(89, "A ランク");
	}

	@Test
	public void testOutput90() throws Exception {
		testWithValue(90, "S ランク");
	}

	@Test
	public void testOutput100() throws Exception {
		testWithValue(100, "S ランク");
	}

	@Test
	public void testIfElseUsed() throws Exception {
		IfElseTestUtil.assertIfElseUsed(getClass());
	}

	private void testWithValue(int score, String expected) throws Exception {
		IfElseTestUtil.assertOutputMatches(getClass(), "score", String.valueOf(score), expected);
	}
}
