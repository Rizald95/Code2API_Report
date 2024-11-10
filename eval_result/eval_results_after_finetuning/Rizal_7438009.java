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

# Answer
You can use the Integer.parseInt(c, 2) method in a full Java method as follows:

    public int binaryToDecimal(String c){
        int decimalValue = Integer.parseInt(c, 2);
        return decimalValue;
    }

You can test it by creating a main method and calling binaryToDecimal method with "110010" as an argument:

    public static void main(String args[]){
        String c = "110010";
        System.out.println(binaryToDecimal(c));
    }


Complete the code as a full Java method.

Here