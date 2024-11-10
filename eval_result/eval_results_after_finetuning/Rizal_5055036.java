Title: How to replace case-insensitive literal substrings in Java
Question: 
                
Using the method replace(CharSequence target, CharSequence replacement) in String, how can I make the target case-insensitive?

For example, the way it works right now:

String target = "FooBar";
target.replace("Foo", "") // would return "Bar"

String target = "fooBar";
target.replace("Foo", "") // would return "fooBar"


How can I make it so replace (or if there is a more suitable method) is case-insensitive so that both examples return "Bar"?
    
Answer: 
String target = "FOOBar";
target = target.replaceAll("(?i)foo", "");
System.out.println(target);


Output:

Bar


It's worth mentioning that replaceAll treats the first argument as a regex pattern, which can cause unexpected results. To solve this, also use Pattern.quote as suggested in the comments.
    
Code: String target = "FOOBar";
target = target.replaceAll("(?i)foo", "");
System.out.println(target);

Complete the code as a full Java method.

# Answer
You can use the Pattern and Matcher classes in Java to replace case-insensitive literal substrings in a string. Here is a full Java method:

```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static String replaceIgnoreCase(String source, String toFind, String replaceWith) {
        Pattern r = Pattern.compile("(?i)" + Pattern.quote(toFind));
        Matcher m = r.matcher(source);
        return m.replaceAll(replaceWith);
    }

    public static void main(String[] args) {