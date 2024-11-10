Title: How to remove all characters before a specific character in Java?
Question: 
                
I have a string and I'm getting value through a html form so when I get the value it comes in a URL so I want to remove all the characters before the specific charater which is = and I also want to remove this character. I only want to save the value that comes after = because I need to fetch that value from the variable..

EDIT : I need to remove the = too since I'm trying to get the characters/value in string after it...
    
Answer: 
You can use .substring():
String s = "the text=text";
String s1 = s.substring(s.indexOf("=") + 1);
s1.trim();

then s1 contains everything after = in the original string.
s1.trim()
.trim() removes spaces before the first character (which isn't a whitespace, such as letters, numbers etc.) of a string (leading spaces) and also removes spaces after the last character (trailing spaces).
    
Code: String s = "the text=text";
String s1 = s.substring(s.indexOf("=") + 1);
s1.trim();

Complete the code as a full Java method.

```java
public class Main {
    public static void main(String[] args) {
        String input = "username=JohnDoe";
        String result = extractAfterEquals(input);
        System.out.println(result); // Should print "JohnDoe"
    }

    public static String extractAfterEquals(String input) {
        // Check if the input string contains '='
        if (input.contains("=")) {
            // Find the position of '='
            int index = input.indexOf("=");
            // Extract the substring after '='
            String afterEquals = input.substring(index + 1);
            // Remove