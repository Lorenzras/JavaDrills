package drill03_ifelse;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

public class IfElse1Test {

    @Test
    public void testOutput59() throws Exception {
        testWithValue(59, "不合格");
    }

    @Test
    public void testOutput60() throws Exception {
        testWithValue(60, "合格");
    }

    @Test
    public void testOutput100() throws Exception {
        testWithValue(100, "合格");
    }


    @Test
    public void testIfElseUsed() throws IOException {
    	SourceCodeAssert.assertIfElseUsed(getClass());
    }

    private void testWithValue(int score, String expected) throws Exception {
    	SourceCodeAssert.assertOutputMatches(getClass(), "score", String.valueOf(score), expected);
    }
}
