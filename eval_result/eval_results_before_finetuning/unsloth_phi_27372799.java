Title: How to parse string containing negative number into integer?
Question: 
                
Part of my code is here!

bufferedReader=new BufferedReader (inputstreamreader);
message=bufferedReader.readLine ();// ex: message has (1,-3)
String[] msg=message.split (",") //I use comma (,) as deliminator
int x=Integer.parseInt (msg [0]);
int y=Integer.parseInt (msg [1]);


This clearly parses but the problem is it looses negative sign. That is the "message" contains (1,-3). Pls help me to parse without loosing -ve sign.
    
Answer: 
String message = "1,-3";
String[] msg = message.split(",");
int x = Integer.parseInt(msg[0]);
int y = Integer.parseInt(msg[1]);

System.out.println(x);
System.out.println(y);

Works without a problem. Output:

1
-3

    
Code: String message = "1,-3";
String[] msg = message.split(",");
int x = Integer.parseInt(msg[0]);
int y = Integer.parseInt(msg[1]);

System.out.println(x);
System.out.println(y);

Complete the code as a full Java method.

Here's a complete Java method that parses a string containing a negative number into integers, preserving the negative sign:

```java
public class Parser {

    public static void main(String[] args) {
        String message = "1,-3";
        int[] parsedNumbers = parseMessage(message);
        for (int number : parsedNumbers) {
            System.out.println(number);
        }
    }

    public static int[] parseMessage(String message) {
        String[] parts = message.split(",");
        int[] numbers = new int[parts.length];
        for (int i = 0; i <