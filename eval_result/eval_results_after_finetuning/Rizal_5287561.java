Title: How to get the user input in Java?
Question: 
                
I attempted to create a calculator, but I can not get it to work because I don't know how to get user input.

How can I get the user input in Java?
    
Answer: 
One of the simplest ways is to use a Scanner object as follows:

import java.util.Scanner;

Scanner reader = new Scanner(System.in);  // Reading from System.in
System.out.println("Enter a number: ");
int n = reader.nextInt(); // Scans the next token of the input as an int.
//once finished
reader.close();

    
Code: import java.util.Scanner;

Scanner reader = new Scanner(System.in);  // Reading from System.in
System.out.println("Enter a number: ");
int n = reader.nextInt(); // Scans the next token of the input as an int.
//once finished
reader.close();

Complete the code as a full Java method.

# Answer

You can create a Java method that uses the Scanner class to read an integer from the user as follows:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int number = getIntegerFromUser();
        System.out.println("You entered: " + number);
    }

    public static int getIntegerFromUser() {
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        reader.close();
        return number;
    }
}