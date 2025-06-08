package drill05_switch;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

public class Switch5Test {

	@Test
	public void testSpring() throws Exception {
		testWith("春", "花が咲く季節です");
	}

	@Test
	public void testSummer() throws Exception {
		testWith("夏", "海に行こう");
	}

	@Test
	public void testAutumn() throws Exception {
		testWith("秋", "紅葉がきれいです");
	}

	@Test
	public void testWinter() throws Exception {
		testWith("冬", "雪が降ります");
	}

	@Test
	public void testOther() throws Exception {
		testWith("梅雨", "不明な季節です");
	}

	@Test
	public void testSwitchUsed() throws Exception {
		SourceCodeAssert.assertSwitchUsed(getClass());
	}

	private void testWith(String value, String expected) throws Exception {
		SourceCodeAssert.assertOutputMatches(getClass(), "season", "\"" + value + "\"", expected);
	}
}
