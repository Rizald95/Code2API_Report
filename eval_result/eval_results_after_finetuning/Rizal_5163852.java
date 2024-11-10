Title: How do I get the last character of a string?
Question: 
                
How do I get the last character of a string?
public class Main {
    public static void main(String[] args)  {
        String s = "test string";
        //char lastChar = ???
    }   
}

    
Answer: 
The code:

public class Test {
    public static void main(String args[]) {
        String string = args[0];
        System.out.println("last character: " +
                           string.substring(string.length() - 1)); 
    }
}


The output of java Test abcdef:

last character: f

    
Code: public class Test {
    public static void main(String args[]) {
        String string = args[0];
        System.out.println("last character: " +
                           string.substring(string.length() - 1)); 
    }
}

Complete the code as a full Java method.

# Answer

You can use the String substring() method:

String lastChar = str.substring(str.length() - 1);

Full Java method:

public String lastChar(String str) {
    String lastChar = str.substring(str.length() - 1);
    return lastChar;
}

DEMO

Code:
public class Test {

    public static void main(String args[]) {
        String str = "test string";
        System.out.println("Last character: " + lastChar(str));
    }

    public static String lastChar(String str) {
        String lastChar =