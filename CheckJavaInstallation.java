/** Java program to check if java is installed in your computer. */
public class CheckJavaInstallation {
    public static void main(String[] args) {
        String javaVersion = System.getProperty("java.version");
        String javaRuntimeVersion = System.getProperty("java.runtime.version");        
        String javaClassPath = System.getProperty("java.class.path");

        System.out.println("Java Version: " + javaVersion);
        System.out.println("Java Runtime Version: " + javaRuntimeVersion);        
        System.out.println("Java Class Path: " + javaClassPath);
    }
}
