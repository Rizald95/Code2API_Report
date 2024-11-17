import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractSubstring {
    public static void main(String[] args) {
        String mydata = "some string with 'the data i want' inside";
        Pattern pattern = Pattern.compile("'(.*?)'");
        Matcher matcher = pattern.matcher(mydata);
        if (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}