package utils;

public class TestMetaUtil {

    public static String getBaseClassName(Class<?> testClass) {
        return testClass.getSimpleName().replace("Test", "");
    }

    public static String getPackageName(Class<?> testClass) {
        return testClass.getName().substring(0, testClass.getName().lastIndexOf('.'));
    }

    public static String getSourcePath(Class<?> testClass) {
        String packagePath = getPackageName(testClass).replace('.', '/');
        String className = getBaseClassName(testClass);
        return "src/" + packagePath + "/" + className + ".java";
    }

    public static String getTempClassName(Class<?> testClass) {
        return getBaseClassName(testClass) + "Temp";
    }
}
