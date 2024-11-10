Title: How to convert BigInteger to String in java
Question: 
                
I converted a String to BigInteger as follows:

Scanner sc=new Scanner(System.in);
System.out.println("enter the message");
String msg=sc.next();
byte[] bytemsg=msg.getBytes();
BigInteger m=new BigInteger(bytemsg); 


Now I want my string back. I'm using m.toString() but that's giving me the desired result.

Why? Where is the bug and what can I do about it?
    
Answer: 
You want to use BigInteger.toByteArray()

String msg = "Hello there!";
BigInteger bi = new BigInteger(msg.getBytes());
System.out.println(new String(bi.toByteArray())); // prints "Hello there!"


The way I understand it is that you're doing the following transformations:

  String  -----------------> byte[] ------------------> BigInteger
          String.getBytes()         BigInteger(byte[])


And you want the reverse:

  BigInteger ------------------------> byte[] ------------------> String
             BigInteger.toByteArray()          String(byte[])


Note that you probably want to use overloads of String.getBytes() and String(byte[]) that specifies an explicit encoding, otherwise you may run into encoding issues.
    
Code: String msg = "Hello there!";
BigInteger bi = new BigInteger(msg.getBytes());
System.out.println(new String(bi.toByteArray())); // prints "Hello there!"

Complete the code as a full Java method.

Answer:
Here's a complete Java method that takes a BigInteger, converts it to a byte array, and then back to a String:

```java
import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerToString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the BigInteger value as a string:");
        String bigIntStr = sc.next();

        // Convert the string representation of BigInteger to BigInteger
        BigInteger bigInt = new BigInteger(bigIntStr);

        // Convert