package drill03_ifelse;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import utils.TestMetaUtil;

public class IfElse2Test {

    final String className = TestMetaUtil.getBaseClassName(getClass());
    final String packageName = TestMetaUtil.getPackageName(getClass());
    final String sourcePath = TestMetaUtil.getSourcePath(getClass());
    //final String tempClassName = TestMetaUtil.getTempClassName(getClass());

    @Test
    public void testOutput17() throws Exception {
        testWithValue(17, "未成年");
    }

    @Test
    public void testOutput18() throws Exception {
        testWithValue(18, "大人");
    }

    @Test
    public void testOutput30() throws Exception {
        testWithValue(30, "大人");
    }

    @Test
    public void testIfElseUsed() throws IOException {
    	IfElseTestUtil.assertIfElseUsed(getClass());
    }

    private void testWithValue(int age, String expected) throws Exception {
    	IfElseTestUtil.assertOutputMatches(getClass(), "age", age, expected);
    }
}
