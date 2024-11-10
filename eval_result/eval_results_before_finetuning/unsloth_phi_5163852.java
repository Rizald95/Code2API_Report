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
        String s = "Hello World";
        char lastChar = getLastChar(s);
        System.out.println("The last character is: " + lastChar);
    }

    public static char getLastChar(String s) {
        return s.charAt(s.length() - 1);
    }
}

In this code, the method `getLastChar` takes a string `s` as input and returns the last character of the string. The `charAt` method is used to access the character at a specific index in the string. In this case, we