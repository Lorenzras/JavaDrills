// JavaRunnerUtil.java
package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaRunnerUtil {

	private static final String JAVA_HOME = "C:\\data\\2_java_logic\\0_binary\\pleiades\\java\\8";
	private static final String JAVAC = JAVA_HOME + "\\bin\\javac.exe";
	private static final String JAVA = JAVA_HOME + "\\bin\\java.exe";

	public static void compile(Path javaFilePath) throws IOException, InterruptedException {
		Process compile = Runtime.getRuntime().exec(new String[] {
				JAVAC, "-encoding", "UTF-8", javaFilePath.toString()
		});
		if (compile.waitFor() != 0) {
			try (BufferedReader err = new BufferedReader(
					new InputStreamReader(compile.getErrorStream(), StandardCharsets.UTF_8))) {
				StringBuilder error = new StringBuilder();
				String line;
				while ((line = err.readLine()) != null) {
					error.append(line).append("\n");
				}
				throw new RuntimeException("❌ コンパイルエラー:\n" + error);
			}
		}
	}

	public static String run(String packageName, String className) throws IOException, InterruptedException {
		Process run = Runtime.getRuntime().exec(new String[] {
				JAVA, "-Dfile.encoding=UTF-8", "-cp", "src", packageName + "." + className
		});

		StringBuilder output = new StringBuilder();
		try (BufferedReader stdOut = new BufferedReader(
				new InputStreamReader(run.getInputStream(), StandardCharsets.UTF_8))) {

			String line;
			while ((line = stdOut.readLine()) != null) {
				output.append(line).append(System.lineSeparator());
			}
		}

		run.waitFor(); // wait for process to finish
		return output.toString().trim();
	}

	public static void cleanUp(Path tempJavaFile) throws IOException {
		Files.deleteIfExists(tempJavaFile);

		Path classFile = Paths.get(tempJavaFile.toString().replace(".java", ".class"));
		Files.deleteIfExists(classFile);
	}

}
