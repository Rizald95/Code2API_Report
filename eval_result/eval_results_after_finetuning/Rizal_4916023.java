Title: How Match a Pattern in Text using Scanner and Pattern Classes?
Question: 
                
i want to find whether a particular pattern exists in my text file or not.

i m using following classes for this :

java.util.regex.Pattern and java.util.Scanner;


my sample text Line is

String Line="DBREF  1A1F A  102   190  UNP    P08046   EGR1_MOUSE     308    396";


and, i want to match following kind of pattern :

A    102   190


where, at A's position a-z or A-Z but single charter.

at 102's position any integer and of any length.

at 190's position any integer and of any length.

and,My code for pattern matching is:

     Scanner sr=new Scanner(Line);
     Pattern p = Pattern.compile("\\s+([a-zA-Z]){1}\\s+\\d{1,}\\s+\\d{1,}\\s+");
     while(sr.hasNext(p))
     {
         System.out.println("Pattern exists");
         System.out.println("Matched String : "+sr.next(p));
     }


but,
     pattern is not matching even it exist there..

i think the problem is with my pattern string :

\\s+([a-zA-Z]){1}\\s+\\d{1,}\\s+\\d{1,}\\s+"


anybody, Plz help me what pattern string should i use???? 
    
Answer: 
I'm not sure that Scanner is the best tool for this as hasNext(Pattern) checks to see if the next complete token has the next pattern.  Your pattern goes across tokens.

Have you tried using a Matcher object instead of the Scanner?

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Foo2 {
    public static void main(String[] args) {
        String line = "DBREF  1A1F A  102   190  UNP    P08046   EGR1_MOUSE     308    396";
        Pattern r = Pattern.compile("\\s+([a-zA-Z])\\s+\\d+\\s+\\d+\\s");
        Matcher m = r.matcher(line);
        if (m.lookingAt()) {
            System.out.println("Matched String : "+m.group(0));
            System.out.println(m.group(1));
            System.out.println(m.group(2));
        }
    }
}


Code: I'm