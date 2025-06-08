package drill09_arraylist;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

public class ArrayList5Test {

    @Test
    public void testOutput() throws Exception {
        SourceCodeAssert.assertOutputMatches(getClass(), "55");
    }

    @Test
    public void testListValuesPresent() throws IOException {
        SourceCodeAssert.assertContainsWords(getClass(), "11", "22", "33", "44", "55");
    }

    @Test
    public void testArrayListUsed() throws IOException {
        SourceCodeAssert.assertContainsWords(getClass(), "new ArrayList");
    }

}
