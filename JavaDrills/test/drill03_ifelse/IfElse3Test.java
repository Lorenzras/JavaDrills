package drill03_ifelse;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

public class IfElse3Test {

    @Test
    public void testOutputMinus3() throws Exception {
        testWithValue(-3, "0 以下");
    }

    @Test
    public void testOutput0() throws Exception {
        testWithValue(0, "0 以下");
    }

    @Test
    public void testOutput5() throws Exception {
        testWithValue(5, "正の数");
    }

    @Test
    public void testIfElseUsed() throws IOException {
        SourceCodeAssert.assertIfElseUsed(getClass());
    }

    private void testWithValue(int num, String expected) throws Exception {
        SourceCodeAssert.assertOutputMatches(getClass(), "num", String.valueOf(num), expected);
    }
}
