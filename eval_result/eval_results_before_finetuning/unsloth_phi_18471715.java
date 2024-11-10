Title: How can I add escape characters to a Java String?
Question: 
                
If I had a string variable:

String example = "Hello, I'm here";


and I wanted to add an escape character in front of every ' and " within the variable (i.e. not actually escape the characters), how would I do that?
    
Answer: 
I'm not claiming elegance here, but i think it does what you want it to do (please correct me if I'm mistaken):

public static void main(String[] args)
{
    String example = "Hello, I'm\" here";
    example = example.replaceAll("'", "\\\\'");
    example = example.replaceAll("\"", "\\\\\"");
    System.out.println(example);
}


outputs

Hello, I\'m\" here

    
Code: public static void main(String[] args)
{
    String example = "Hello, I'm\" here";
    example = example.replaceAll("'", "\\\\'");
    example = example.replaceAll("\"", "\\\\\"");
    System.out.println(example);
}

Complete the code as a full Java method.

Here's a complete Java method that adds escape characters to every ' and " in a given string:

```java
public class EscapeCharacters {

    public static String addEscapeCharacters(String input) {
        // Replace every single quote with an escaped single quote
        input = input.replaceAll("'", "\\\\'");
        
        // Replace every double quote with an escaped double quote
        input = input.replaceAll("\"", "\\\\\"");
        
        return input;
    }

    public static void main(String[] args) {
        String example = "Hello, I'm\" here";
        String modified