package drill04_ifelseif;

import org.junit.jupiter.api.Test;

public class IfElseIf1Test {

    @Test
    public void testPerfectScore() throws Exception {
        testWithValue(100, "満点");
    }

    @Test
    public void testPassingScore() throws Exception {
        testWithValue(72, "合格");
    }

    @Test
    public void testFailingScore() throws Exception {
        testWithValue(40, "不合格");
    }

    @Test
    public void testIfElseUsed() throws Exception {
        IfElseTestUtil.assertIfElseUsed(getClass());
    }

    private void testWithValue(int score, String expected) throws Exception {
        IfElseTestUtil.assertOutputMatches(getClass(), "score", String.valueOf(score), expected);
    }
}
