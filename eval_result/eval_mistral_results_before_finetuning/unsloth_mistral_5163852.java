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

public class Main {
    public static void main(String[] args) {
        String s = "test string";
        char lastChar = getLastChar(s);
        System.out.println("last character: " + lastChar);
    }

    public static char getLastChar(String s) {
        return s.substring(s.length() - 1).charAt(0);
    }
}

The output of java Main:

last character: t

    
Code: public class Main {
    public static void main(String[] args) {
        String s = "test string";
        char lastChar = getLast