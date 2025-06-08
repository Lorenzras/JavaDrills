package drill03_ifelse;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class IfElse5Test {

    @Test
    public void testOutputTrue() throws Exception {
        testWithValue(true, "会員です");
    }

    @Test
    public void testOutputFalse() throws Exception {
        testWithValue(false, "会員ではありません");
    }

    @Test
    public void testIfElseUsed() throws IOException {
        IfElseTestUtil.assertIfElseUsed(getClass());
    }

    private void testWithValue(boolean isMember, String expected) throws Exception {
        IfElseTestUtil.assertOutputMatches(getClass(), "isMember", String.valueOf(isMember), expected);
    }
}
