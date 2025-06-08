package drill05_switch;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

public class Switch2Test {

  @Test
  public void testOutput1() throws Exception {
    testWithValue(1, "初級");
  }

  @Test
  public void testOutput2() throws Exception {
    testWithValue(2, "中級");
  }

  @Test
  public void testOutput3() throws Exception {
    testWithValue(3, "上級");
  }

  @Test
  public void testOutput0() throws Exception {
    testWithValue(0, "未設定");
  }

  @Test
  public void testSwitchUsed() throws Exception {
    SourceCodeAssert.assertSwitchUsed(getClass());
  }

  private void testWithValue(int level, String expected) throws Exception {
    SourceCodeAssert.assertOutputMatches(getClass(), "level", level, expected);
  }
}
