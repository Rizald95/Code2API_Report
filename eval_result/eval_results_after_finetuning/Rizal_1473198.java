import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuotesExtractor {

    // Method to extract words between quotes
    public static List<String> getWordsBetweenQuotes(String line) {
        List<String> result = new ArrayList<>();
        
        // Define the regex pattern to match text inside double quotes
        Pattern p = Pattern.compile("\"([^\"]*)\"");
        Matcher m = p.matcher(line);
        
        // Loop through all matches and add them to the result list
        while (m.find()) {
            result.add(m.group(1));  // Group 1 contains the text between the quotes
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Example lines with varying number of quotes
        String line1 = "Here just one \"comillas\"";
        String line2 = "But I also could have more \"mas\" values in \"comillas\" and that \"is\" the \"trick\"";
        String line3 = "I was thinking in a method that return \"a\" list of \"words\" that \"are\" between \"comillas\"";

        // Extract and print the results
        System.out.println(getWordsBetweenQuotes(line1));  // Output: [comillas]
        System.out.println(getWordsBetweenQuotes(line2));  // Output: [mas, comillas, is, trick]
        System.out.println(getWordsBetweenQuotes(line3));  // Output: [a, words, are, comillas]
    }
}
