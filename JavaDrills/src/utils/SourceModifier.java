// JavaSourceModifier.java
package utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SourceModifier {

    public static Path modifyVariable(String originalPathStr, String oldClassName, String newClassName,
                                      String varName, String newValue) throws IOException {
        Path originalPath = Paths.get(originalPathStr);
        String source = readOriginalSource(originalPath);

        String modifiedSource = replaceClassName(source, oldClassName, newClassName);
        modifiedSource = replaceVariableValue(modifiedSource, varName, newValue);

        Path modifiedPath = originalPath.getParent().resolve(newClassName + ".java");
        writeToTempFile(modifiedPath, modifiedSource);
        return modifiedPath;
    }

    public static String readOriginalSource(Path path) throws IOException {
        return new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
    }

    public static String replaceClassName(String source, String oldClass, String newClass) {
        return source.replaceAll("public\\s+class\\s+" + oldClass, "public class " + newClass);
    }

    public static String replaceVariableValue(String source, String varName, String newValue) {
        return source.replaceAll(varName + "\\s*=\\s*[^;]+;", varName + " = " + newValue + ";");
    }

    public static void writeToTempFile(Path path, String content) throws IOException {
        Files.write(path, content.getBytes(StandardCharsets.UTF_8));
    }
}
