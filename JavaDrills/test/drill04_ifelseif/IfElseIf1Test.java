package drill04_ifelseif;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

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
        SourceCodeAssert.assertIfElseUsed(getClass());
    }

    private void testWithValue(int score, String expected) throws Exception {
        SourceCodeAssert.assertOutputMatches(getClass(), "score", String.valueOf(score), expected);
    }
}
