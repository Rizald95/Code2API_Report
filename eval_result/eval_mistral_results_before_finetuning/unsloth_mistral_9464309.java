import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = "Print this Print that Print this";
        Pattern p = Pattern.compile(".*\\bthis\\b.*");
        Matcher m = p.matcher(input);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}