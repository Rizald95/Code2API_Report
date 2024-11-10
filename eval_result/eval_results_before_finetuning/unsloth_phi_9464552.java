Title: how to extract a phone number for a string using regular expression?
Question: 
                
If I have a string that contains the following: This is 1 test 123-456-7890 
I need to extract 1234567890 as a phone number. I don't want to extract the number 1 that is before test. 
How can I do that using regular expressions in java?

I know a way but I am not sure if it is the best solution: 

String inputString = "This is 1 test 123-456-7890";
string result =  inputString.replaceAll("(\\d{3})-(\\d{3})-(\\d{4})",""); 
String phoneNumber = inputString.replace(result, "");

    
Answer: 
The following code will check for the phone number in the string you mention and print it:

String str = "This is 1 test 123-456-7890";

Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
Matcher matcher = pattern.matcher(str);
if (matcher.find()) {
    System.out.println(matcher.group(0));
}


But, as pointed out in other answers, many phone numbers (especially not international ones) will not match the pattern.
    
Code: String str = "This is 1 test 123-456-7890";

Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
Matcher matcher = pattern.matcher(str);
if (matcher.find()) {
    System.out.println(matcher.group(0));
}

Complete the code as a full Java method.

Here's a complete Java method that extracts a phone number from a given string using a regular expression:

```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExtractor {

    public static String extractPhoneNumber(String inputString) {
        // Define the regular expression pattern for a phone number
        String phoneNumberPattern = "\\d{3}-\\d{3}-\\d{4}";

        // Compile the pattern into a regular expression object
        Pattern pattern = Pattern.compile(phoneNumberPattern);

        // Create a matcher object to search for the pattern in