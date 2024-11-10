Title: How to replace a word in a String?
Question: 
                
I'm using a String like:

String message = "%%NAME is inviting you";


I am using message.replaceAll("%%NAME", me); where me is a String. This line of code is not working for me. I was wondering what I was doing wrong?
    
Answer: 
Code looks more or less OK, though there may be some syntax issues. Here's a working example:

String message = "%%NAME is inviting you.";
String name = "Diana";
String result = message.replaceAll("%%NAME", name);

    
Code: String message = "%%NAME is inviting you.";
String name = "Diana";
String result = message.replaceAll("%%NAME", name);

Complete the code as a full Java method.

Here's a complete Java method that replaces "%%NAME" in a given string with a provided name:

```java
public class StringReplacer {

    public static String replaceNameInMessage(String message, String name) {
        // Replace "%%NAME" with the provided name in the message
        return message.replaceAll("%%NAME", name);
    }

    public static void main(String[] args) {
        String message = "%%NAME is inviting you.";
        String name = "Diana";
        
        // Call the method and print the result
        String result = replaceNameInMessage(message, name);
       