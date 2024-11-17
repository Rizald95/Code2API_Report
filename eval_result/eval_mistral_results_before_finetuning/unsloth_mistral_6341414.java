import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class CheckRegex {
    public static boolean isRegex(String input) {
        try {
            Pattern.compile(input);
            return true;
        } catch (PatternSyntaxException e) {
            return false;
        }
    }
}