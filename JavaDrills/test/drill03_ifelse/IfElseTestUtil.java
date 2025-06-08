package drill03_ifelse;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Path;
import java.util.regex.Pattern;

import utils.JavaRunnerUtil;
import utils.SourceModifier;
import utils.SourceReader;
import utils.TestMetaUtil;

public class IfElseTestUtil {

	private IfElseTestUtil() {
		throw new UnsupportedOperationException("Utility class");
	}

	public static void assertIfElseUsed(String source) {
		boolean hasIf = Pattern.compile("\\bif\\b").matcher(source).find();
		boolean hasElse = Pattern.compile("\\belse\\b").matcher(source).find();
		assertTrue(hasIf && hasElse, "❌ if と else の両方を使用してください。");
	}

	public static void assertIfElseUsed(Class<?> testClass) throws IOException {
		final String sourcePath = TestMetaUtil.getSourcePath(testClass);
		String source = SourceReader.readSource(sourcePath);
		assertIfElseUsed(source);
	}

	public static void assertOutputMatches(Class<?> testClass, String variableName, int value, String expected)
			throws Exception {
		String className = TestMetaUtil.getBaseClassName(testClass);
		String packageName = TestMetaUtil.getPackageName(testClass);
		String sourcePath = TestMetaUtil.getSourcePath(testClass);
		String tempClassName = TestMetaUtil.getTempClassName(testClass);

		Path modified = SourceModifier.modifyVariable(
				sourcePath, className, tempClassName, variableName, String.valueOf(value));

		try {
			JavaRunnerUtil.compile(modified);
			String output = JavaRunnerUtil.run(packageName, tempClassName);
			assertEquals(expected, output, variableName + " = " + value + " のとき「" + expected + "」と出力される必要があります。");
		} finally {
			JavaRunnerUtil.cleanUp(modified);
		}
	}

}
