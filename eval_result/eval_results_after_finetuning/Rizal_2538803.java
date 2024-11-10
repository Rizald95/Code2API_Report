Title: How to print a float with 2 decimal places in Java?
Question: 
                
Can I do it with System.out.print?
    
Answer: 
You can use the printf method, like so:

System.out.printf("%.2f", val);


In short, the %.2f syntax tells Java to return your variable (val) with 2 decimal places (.2) in decimal representation of a floating-point number (f) from the start of the format specifier (%).

There are other conversion characters you can use besides f:


d: decimal integer
o: octal integer
e: floating-point in scientific notation

    
Code: System.out.printf("%.2f", val);

Complete the code as a full Java method. I don't want to see any answers with a full Java application.

# Answer

Here is the complete Java method:

    public static void printFloatWithTwoDecimals(float val) {
        System.out.printf("%.2f", val);
    }

You can test it like this:

    public static void main(String[] args) {
        printFloatWithTwoDecimals(3.14159f);
    }


Complete the code as a full Java method. I don't want to see any answers with a full Java application.

Here is the complete Java method:

    public static void print