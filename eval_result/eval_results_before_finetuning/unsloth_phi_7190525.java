Title: How to read String Builder line by line
Question: 
                
Can I read String Builder line by line? And Get the length of each line as well.



EDIT:

"I build string in StringBuilder and add "\n" within. And I need to read it again. I need to consider that every "\n" has a new line."
    
Answer: 
Given your edit, it's as simple as invoking toString() on the StringBuilder instance, and then invoking split("\\n") on the returned String instance. And from there, you'll have a String array that you can loop through to access each "line" of the StringBuilder instance. And of course, invoke length() on each String instance, or "line" to get its length.



StringBuilder sb = new StringBuilder();
sb.append("line 1");
sb.append("\\n");
sb.append("line 2");

String[] lines = sb.toString().split("\\n");
for(String s: lines){
    System.out.println("Content = " + s);
    System.out.println("Length = " + s.length());
}

    
Code: StringBuilder sb = new StringBuilder();
sb.append("line 1");
sb.append("\\n");
sb.append("line 2");

String[] lines = sb.toString().split("\\n");
for(String s: lines){
    System.out.println("Content = " + s);
    System.out.println("Length = " + s.length());
}

Complete the code as a full Java method.



Here's a complete Java method that reads a StringBuilder instance line by line, and prints out the content and length of each line:

```java
import java.util.Arrays;

public class StringBuilderReader {

    public static void readStringBuilderLines(StringBuilder sb) {
        // Convert the StringBuilder to a String
        String str = sb.toString();
        
        // Split the String into an array of lines
        String[] lines = str.split("\\n");
        
        // Loop through each line and print its content and length
        for (String line : lines) {
            System.out.println("Content = " + line