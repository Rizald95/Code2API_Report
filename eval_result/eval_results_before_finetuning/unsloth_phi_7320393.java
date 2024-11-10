Title: How to test for blank line with Java Scanner?
Question: 
                
I am expecting input with the scanner until there is nothing (i.e. when user enters a blank line). How do I achieve this? 

I tried:

while (scanner.hasNext()) {
    // process input
}


But that will get me stuck in the loop
    
Answer: 
Here's a way:

Scanner keyboard = new Scanner(System.in);
String line = null;
while(!(line = keyboard.nextLine()).isEmpty()) {
  String[] values = line.split("\\s+");
  System.out.print("entered: " + Arrays.toString(values) + "\n");
}
System.out.print("Bye!");

    
Code: Scanner keyboard = new Scanner(System.in);
String line = null;
while(!(line = keyboard.nextLine()).isEmpty()) {
  String[] values = line.split("\\s+");
  System.out.print("entered: " + Arrays.toString(values) + "\n");
}
System.out.print("Bye!");

Complete the code as a full Java method.

Here's a complete Java method that reads input from the user until a blank line is entered:

```java
import java.util.Arrays;
import java.util.Scanner;

public class InputProcessor {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String line = null;
        while(!(line = keyboard.nextLine()).isEmpty()) {
            String[] values = line.split("\\s+");
            System.out.print("Entered: " + Arrays.toString(values) + "\n");
        }
        System.out.print("Bye!");