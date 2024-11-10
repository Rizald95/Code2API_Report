Title: how can I get the text before and after the "-" (dash)
Question: 
                
I have a String and I want to get the words before and after the " - " (dash). How can I do that?

example:
String: 

"First part - Second part"


output:

first: First part
second: Second part

    
Answer: 
With no error-checking or safety, this could work:

String[] parts = theString.split("-");
String first = parts[0];
String second = parts[1];

    
Code: String[] parts = theString.split("-");
String first = parts[0];
String second = parts[1];

Complete the code as a full Java method.

Here's a complete Java method that splits a string into two parts using a dash as the delimiter and returns the first and second parts:

```java
public class StringSplitter {

    public static String[] splitString(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string must not be null or empty");
        }

        String[] parts = input.split("-");

        if (parts.length != 2) {
            throw new IllegalArgumentException("Input string must contain exactly one dash");
        }

        String first = parts[0];
        String second