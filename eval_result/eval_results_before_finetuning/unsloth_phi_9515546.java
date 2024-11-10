Title: How to get the string after last comma in java?
Question: 
                
How do I get the content after the last comma in a string using a regular expression?

Example: 

abcd,fg;ijkl, cas


The output should be cas



Note: There is a space between last comma and 'c' character  which also needs to be removed. 
Also the pattern contains only one space after last comma.
    
Answer: 
Using regular expressions:

Pattern p = Pattern.compile(".*,\\s*(.*)");
Matcher m = p.matcher("abcd,fg;ijkl, cas");

if (m.find())
    System.out.println(m.group(1));


Outputs:

cas




Or you can use simple String methods:


System.out.println(s.substring(s.lastIndexOf(",") + 1).trim());
System.out.println(s.substring(s.lastIndexOf(", ") + 2));

    
Code: Pattern p = Pattern.compile(".*,\\s*(.*)");
Matcher m = p.matcher("abcd,fg;ijkl, cas");

if (m.find())
    System.out.println(m.group(1));

Complete the code as a full Java method.



Here's a Java method that uses a regular expression to extract the content after the last comma, including the space after the comma:


```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAfterLastComma {

    public static String getContentAfterLastComma(String input) {
        // Define the regular expression pattern
        Pattern p = Pattern.compile(".*,\\s*(.*)");
        
        // Create a matcher with the input string
        Matcher m = p.matcher(input);
        
        // Check if the pattern matches and find the first