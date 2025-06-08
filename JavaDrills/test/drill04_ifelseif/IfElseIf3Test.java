package drill04_ifelseif;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

public class IfElseIf3Test {

    @Test
    public void testOutput159() throws Exception {
        testWithValue(159, "低身長");
    }

    @Test
    public void testOutput160() throws Exception {
        testWithValue(160, "平均");
    }

    @Test
    public void testOutput179() throws Exception {
        testWithValue(179, "平均");
    }

    @Test
    public void testOutput180() throws Exception {
        testWithValue(180, "高身長");
    }

    @Test
    public void testOutput190() throws Exception {
        testWithValue(190, "高身長");
    }

    @Test
    public void testIfElseUsed() throws Exception {
        SourceCodeAssert.assertIfElseUsed(getClass());
    }

    private void testWithValue(int height, String expected) throws Exception {
        SourceCodeAssert.assertOutputMatches(getClass(), "height", String.valueOf(height), expected);
    }
}
