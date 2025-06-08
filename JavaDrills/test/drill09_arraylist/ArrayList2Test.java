package drill09_arraylist;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

public class ArrayList2Test {

    @Test
    public void testOutput() throws Exception {
        SourceCodeAssert.assertOutputMatches(getClass(), "Banana");
    }

    @Test
    public void testListValuesPresent() throws IOException {
        SourceCodeAssert.assertContainsWords(getClass(), "Apple", "Banana", "Cherry");
    }

    @Test
    public void testArrayListUsed() throws IOException {
        SourceCodeAssert.assertContainsWords(getClass(), "new ArrayList");
    }
}
