Title: How do I increment a variable to the next or previous letter in the alphabet?
Question: 
                
I have a capital letter defined in a variable string, and I want to output the next and previous letters in the alphabet. For example, if the variable was equal to 'C', I would want to output 'B' and 'D'. 
    
Answer: 
One way:

String value = "C";
int charValue = value.charAt(0);
String next = String.valueOf( (char) (charValue + 1));
System.out.println(next);

    
Code: String value = "C";
int charValue = value.charAt(0);
String next = String.valueOf( (char) (charValue + 1));
System.out.println(next);

Complete the code as a full Java method.

Here's a Java method that takes a capital letter as input and returns the next and previous letters in the alphabet:

```java
public class Alphabet {

    public static void main(String[] args) {
        char letter = 'C';
        System.out.println("Next letter: " + nextLetter(letter));
        System.out.println("Previous letter: " + previousLetter(letter));
    }

    public static char nextLetter(char letter) {
        return (char) (letter + 1);
    }

    public static char previousLetter(char letter) {
        return (char) (letter