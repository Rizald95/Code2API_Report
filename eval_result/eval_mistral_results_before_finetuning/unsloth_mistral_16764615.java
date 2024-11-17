import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Test {
    public static void main(String[] args) {
        String str = "\"This is a test\"";
        if (str.matches("\".*\"")) {
            System.out.println("This string starts and ends with a double quote");
        }
    }
}