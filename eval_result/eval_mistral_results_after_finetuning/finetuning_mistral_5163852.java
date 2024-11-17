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

You can use the method substring(int i) of the String class.

Here is the code:

public class Test {
    public static void main(String args[]) {
        String string = args[0];
        System.out.println("last character: " +
                           string.substring(string.length() - 1)); 
    }
}


With this code as a full Java method, when you run it as a Java method and pass it the argument abcdef, it will print:

last character: f

    
Code: public class Test {
    public static void main(String args[]) {
       