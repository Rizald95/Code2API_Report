Title: How to get the second word from a String?
Question: 
                
Take these examples

Smith John
Smith-Crane John
Smith-Crane John-Henry
Smith-Crane John Henry


I would like to get the John
The first word after the space, but it might not be until the end, it can be until a non alpha character. How would this be in Java 1.5?
    
Answer: 
You can use regular expressions and the Matcher class:

String s = "Smith-Crane John-Henry";
Pattern pattern = Pattern.compile("\\s([A-Za-z]+)");
Matcher matcher = pattern.matcher(s);
if (matcher.find()) {
    System.out.println(matcher.group(1));
}


Result:


John

    
Code: String s = "Smith-Crane John-Henry";
Pattern pattern = Pattern.compile("\\s([A-Za-z]+)");
Matcher matcher = pattern.matcher(s);
if (matcher.find()) {
    System.out.println(matcher.group(1));
}

Complete the code as a full Java method.


Answer:

Here's a complete Java method that extracts the first word after the first space in a given string:

```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractSecondWord {

    public static String getSecondWord(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        Pattern pattern = Pattern.compile("\\s([A-Za-z]+)");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            return matcher.