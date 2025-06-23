package drill10_arraylist_for;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import utils.SourceCodeAssert;

public class ArrayListFor3Test {

    @Test
    public void testOutput() throws Exception {
        SourceCodeAssert.assertOutputMatches(getClass(),
                String.join(System.lineSeparator(), "1", "2", "3", "4", "5"));
    }

    @Test
    public void testArrayListUsed() throws IOException {
        SourceCodeAssert.assertContainsWords(getClass(), "new ArrayList");
    }

    @Test
    public void testNormalForLoopUsed() throws IOException {
        SourceCodeAssert.assertNormalForUsed(getClass());
    }
}
