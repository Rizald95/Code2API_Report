Title: How to check if the string is a regular expression or not
Question: 
                
I have a string. How I can check if the string is a regular expression or contains regular expression or it is a normal string?
    
Answer: 
The only reliable check you could do is if the String is a syntactically correct regular expression:

boolean isRegex;
try {
  Pattern.compile(input);
  isRegex = true;
} catch (PatternSyntaxException e) {
  isRegex = false;
}


Note, however, that this will result in true even for strings like Hello World and I'm not a regex, because technically they are valid regular expressions.

The only cases where this will return false are strings that are not valid regular expressions, such as [unclosed character class or (unclosed group or +.
    
Code: boolean isRegex;
try {
  Pattern.compile(input);
  isRegex = true;
} catch (PatternSyntaxException e) {
  isRegex = false;
}

Complete the code as a full Java method.

# Answer
You can create a full Java method as follows:

    import java.util.regex.Pattern;
    import java.util.regex.PatternSyntaxException;

    public class Main {
        public static void main(String[] args) {
            System.out.println(isValidRegex("Hello World"));
            System.out.println(isValidRegex("[unclosed character class or (unclosed group or +"]"));
        }

        public static boolean isValidRegex(String input) {
            boolean isRegex = false;
            try {
                Pattern.compile(input);
                isRegex = true;
