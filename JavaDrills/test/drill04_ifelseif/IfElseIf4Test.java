package drill04_ifelseif;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

public class IfElseIf4Test {

    @Test
    public void testOutput36_9() throws Exception {
        testWithValue(36.9, "平熱");
    }

    @Test
    public void testOutput37_0() throws Exception {
        testWithValue(37.0, "微熱");
    }

    @Test
    public void testOutput37_9() throws Exception {
        testWithValue(37.9, "微熱");
    }

    @Test
    public void testOutput38_0() throws Exception {
        testWithValue(38.0, "高熱");
    }

    @Test
    public void testOutput39_0() throws Exception {
        testWithValue(39.0, "高熱");
    }

    @Test
    public void testIfElseUsed() throws Exception {
        SourceCodeAssert.assertIfElseUsed(getClass());
    }

    private void testWithValue(double temperature, String expected) throws Exception {
        SourceCodeAssert.assertOutputMatches(getClass(), "temperature", String.valueOf(temperature), expected);
    }
}
