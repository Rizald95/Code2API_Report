Title: How can I extract the first 4 digits from an int? (Java)
Question: 
                
I'm looking to find a way to convert a string to an int in order to then extract and return the first 4 digits in this int. 

Note: It must remain as a String for the other methods to work properly, though.
    
Answer: 
Try following:

String str = "1234567890";
int fullInt = Integer.parseInt(str);
String first4char = str.substring(0,4);
int intForFirst4Char = Integer.parseInt(first4char);


Wherever you want integer for first four character use intForFirst4Char and where you wanna use string use appropriate.

Hope this helps.
    
Code: String str = "1234567890";
int fullInt = Integer.parseInt(str);
String first4char = str.substring(0,4);
int intForFirst4Char = Integer.parseInt(first4char);

Complete the code as a full Java method.

Here's a Java method that takes a string, extracts the first four digits, and returns them as an integer:

```java
public class ExtractFirstFourDigits {

    public static int extractFirstFourDigits(String numberString) {
        // Check if the input string is not empty and has at least 4 characters
        if (numberString == null || numberString.isEmpty() || numberString.length() < 4) {
            throw new IllegalArgumentException("Input string must be at least 4 characters long");
        }

        // Parse the string to an integer
        int fullInt = Integer.parseInt(numberString);
