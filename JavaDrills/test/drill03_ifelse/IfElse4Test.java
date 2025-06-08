package drill03_ifelse;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class IfElse4Test {

    @Test
    public void testOutput36_8() throws Exception {
        testWithValue(36.8, "平熱");
    }

    @Test
    public void testOutput37_0() throws Exception {
        testWithValue(37.0, "発熱あり");
    }

    @Test
    public void testOutput38_2() throws Exception {
        testWithValue(38.2, "発熱あり");
    }

    @Test
    public void testIfElseUsed() throws IOException {
        IfElseTestUtil.assertIfElseUsed(getClass());
    }

    private void testWithValue(double temp, String expected) throws Exception {
        IfElseTestUtil.assertOutputMatches(getClass(), "temperature", String.valueOf(temp), expected);
    }
}
