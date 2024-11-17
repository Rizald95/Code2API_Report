import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Test {
    public static void main(String[] args) {
        String input = ":abc123:";
        System.out.println(input.matches("[A-Za-z0-9.,-:]*"));
    }
}