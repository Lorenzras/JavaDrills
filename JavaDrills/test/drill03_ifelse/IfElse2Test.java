package drill03_ifelse;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

public class IfElse2Test {

    @Test
    public void testOutput17() throws Exception {
        testWithValue(17, "未成年");
    }

    @Test
    public void testOutput18() throws Exception {
        testWithValue(18, "大人");
    }

    @Test
    public void testOutput30() throws Exception {
        testWithValue(30, "大人");
    }

    @Test
    public void testIfElseUsed() throws IOException {
    	SourceCodeAssert.assertIfElseUsed(getClass());
    }

    private void testWithValue(int age, String expected) throws Exception {
    	SourceCodeAssert.assertOutputMatches(getClass(), "age", String.valueOf(age), expected);
    }
}
