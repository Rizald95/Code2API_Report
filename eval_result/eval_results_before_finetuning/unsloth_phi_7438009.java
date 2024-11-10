Title: How to convert binary string value to decimal
Question: 
                
How to convert a binary String such as

String c = "110010"; // as binary


to the value in decimal in Java? (expected result in the example is 50)
    
Answer: 
Use Integer.parseInt (see javadoc), that converts your String to int using base two:

int decimalValue = Integer.parseInt(c, 2);

    
Code: int decimalValue = Integer.parseInt(c, 2);

Complete the code as a full Java method.

Here's a complete Java method that converts a binary string to its decimal equivalent:

```java
public class BinaryToDecimalConverter {

    public static void main(String[] args) {
        String binaryString = "110010";
        int decimalValue = binaryStringToDecimal(binaryString);
        System.out.println("The decimal value is: " + decimalValue);
    }

    public static int binaryStringToDecimal(String binaryString) {
        if (binaryString == null || binaryString.isEmpty()) {
            throw new IllegalArgumentException("Input binary string cannot be null or empty");
        }

        // Parse