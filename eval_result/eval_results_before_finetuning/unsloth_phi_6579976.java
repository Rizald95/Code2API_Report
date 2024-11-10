Title: How to type ":" ("colon") in regexp?
Question: 
                
: ("colon") has a special meaning in regexp, but I need to use it as is, like [A-Za-z0-9.,-:]*.
I have tried to escape it, but this does not work [A-Za-z0-9.,-\:]*
    
Answer: 
In most regex implementations (including Java's), : has no special meaning, neither inside nor outside a character class.

Your problem is most likely due to the fact the - acts as a range operator in your class:

[A-Za-z0-9.,-:]*


where ,-: matches all ascii characters between ',' and ':'. Note that it still matches the literal ':' however!

Try this instead:

[A-Za-z0-9.,:-]*


By placing - at the start or the end of the class, it matches the literal "-". As mentioned in the comments by Keoki Zee, you can also escape the - inside the class, but most people simply add it at the end.

A demo:

public class Test {
    public static void main(String[] args) {
        System.out.println("8:".matches("[,-:]+"));      // true: '8' is in the range ','..':'
        System.out.println("8:".matches("[,:-]+"));      // false: '8' does not match ',' or ':' or '-'
        System.out.println(",,-,:,:".matches("[,:-]+")); // true: all chars match ',' or ':' or '-'
    }
}

    
Code: [A-Za-z0-9.,-:]*

Complete the code as a full Java method.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String input = "8:";
        Pattern pattern = Pattern.compile("[A-Za-z0-9.,-:]*");
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.matches());
    }
}












































