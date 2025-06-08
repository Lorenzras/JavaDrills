package drill09_arraylist;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

public class ArrayList3Test {

    @Test
    public void testOutput() throws Exception {
        SourceCodeAssert.assertOutputMatches(getClass(), "Cat");
    }

    @Test
    public void testListValuesPresent() throws IOException {
        SourceCodeAssert.assertContainsWords(getClass(), "Cat", "Dog", "Elephant");
    }

    @Test
    public void testArrayListUsed() throws IOException {
        SourceCodeAssert.assertContainsWords(getClass(), "new ArrayList");
    }
}
