import java.util.Properties;

public class OSDetector {
    public static void main(String[] args) {
        Properties props = System.getProperties();
        String osName = props.getProperty("os.name");
        String osVersion = props.getProperty("os.version");
        String osArch = props.getProperty("os.arch");

        System.out.println("Operating System: " + osName);
        System.out.println("Operating System Version: " + osVersion);
        System.out.println("Operating System Architecture: " + osArch);
    }
}