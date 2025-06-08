package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SourceReader {

    public static String readSource(String path) throws IOException {
        String source = new String(Files.readAllBytes(Paths.get(path)), "UTF-8");
        return source.replaceAll("(?s)/\\*.*?\\*/", "")  // block comments
                     .replaceAll("//.*", "")            // line comments
                     .replaceAll("\\s+", " ");          // flatten whitespace
    }
}
