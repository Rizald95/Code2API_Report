import java.io.IOException;

public class LaunchChrome {
    public static void main(String[] args) {
        launchChrome();
    }

    public static void launchChrome() {
        try {
            Process p = Runtime.getRuntime().exec("\"/Program Files (x86)/Google/Chrome/Application/chrome.exe\"");
            p.waitFor();
            System.out.println("Google Chrome launched!");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}