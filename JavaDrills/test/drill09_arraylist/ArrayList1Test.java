package drill09_arraylist;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

public class ArrayList1Test {

    @Test
    public void testOutput() throws Exception {
        SourceCodeAssert.assertOutputMatches(getClass(), "20");
    }

    @Test
    public void testArrayListValuesPresent() throws IOException {
        // Ensure all values in [10, 20, 30] are in source code
        SourceCodeAssert.assertContainsWords(getClass(), "10", "20", "30");
    }

    @Test
    public void testArrayListUsed() throws IOException {
        SourceCodeAssert.assertContainsWords(getClass(), "new ArrayList");
    }
}
