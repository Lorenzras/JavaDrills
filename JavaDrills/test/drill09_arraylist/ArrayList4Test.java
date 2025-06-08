package drill09_arraylist;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

public class ArrayList4Test {

    @Test
    public void testOutput() throws Exception {
        SourceCodeAssert.assertOutputMatches(getClass(), "28");
    }

    @Test
    public void testListValuesPresent() throws IOException {
        SourceCodeAssert.assertContainsWords(getClass(), "7", "14", "21", "28", "35");
    }

    @Test
    public void testArrayListUsed() throws IOException {
        SourceCodeAssert.assertContainsWords(getClass(), "new ArrayList");
    }
}
