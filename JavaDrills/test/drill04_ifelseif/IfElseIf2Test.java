package drill04_ifelseif;

import org.junit.jupiter.api.Test;

public class IfElseIf2Test {

  @Test
  public void testOutput17() throws Exception {
    testWithValue(17, "未成年");
  }

  @Test
  public void testOutput18() throws Exception {
    testWithValue(18, "成人");
  }

  @Test
  public void testOutput64() throws Exception {
    testWithValue(64, "成人");
  }

  @Test
  public void testOutput65() throws Exception {
    testWithValue(65, "高齢者");
  }

  @Test
  public void testOutput90() throws Exception {
    testWithValue(90, "高齢者");
  }

  @Test
  public void testIfElseUsed() throws Exception {
    IfElseTestUtil.assertIfElseUsed(getClass());
  }

  private void testWithValue(int age, String expected) throws Exception {
    IfElseTestUtil.assertOutputMatches(getClass(), "age", String.valueOf(age), expected);
  }
}
