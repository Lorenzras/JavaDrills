package drill05_switch;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

public class Switch1Test {

    @Test
    public void testOutput1() throws Exception {
        testWithValue(1, "月曜日");
    }

    @Test
    public void testOutput2() throws Exception {
        testWithValue(2, "火曜日");
    }

    @Test
    public void testOutput3() throws Exception {
        testWithValue(3, "水曜日");
    }

    @Test
    public void testOutput4() throws Exception {
        testWithValue(4, "木曜日");
    }

    @Test
    public void testOutput5() throws Exception {
        testWithValue(5, "その他の日");
    }

    private void testWithValue(int day, String expected) throws Exception {
        SourceCodeAssert.assertOutputMatches(getClass(), "day", day, expected);
    }
}
