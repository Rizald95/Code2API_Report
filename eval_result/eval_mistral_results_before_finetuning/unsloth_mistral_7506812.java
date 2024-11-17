Title: How to adjust trailing whitespace?
Question: 
                
I am writing to a file in java but the strings that are input into the file are different, how do i adjust the trailing whitespace depending on the length of the string.

for example

First Name     Last Name     Address
----------     ---------     -------
Michael        Jordan        23 E. Jump Street
Larry          Bird          33 North Celtics Run

    
Answer: 
You can use String.format():

System.out.println(String.format("[%-20s]", "foo"));


will give you:

[foo                 ]

    
Code: System.out.println(String.format("[%-20s]", "foo"));

Complete the code as a full Java method.

```java
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class AdjustTrailingWhitespace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of records: ");
        int numRecords = scanner.nextInt();

        try (FileWriter writer = new FileWriter("output.txt")) {
            for (int i = 0; i < numRecords; i++) {
                System.out.print("Enter first name: ");
               