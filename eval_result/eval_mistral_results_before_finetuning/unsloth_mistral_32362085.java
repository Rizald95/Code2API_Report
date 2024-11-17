Title: How do I check if there's a time inside a string?
Question: 
                
I'm trying to check if a String contains a time, 12 or 24 hour format, using this regex: .*([01]?[0-9]|2[0-3]):[0-5][0-9].* and used String.matches(), but it didn't seem to work. Am I doing something wrong?

Also, I know String.matches() doesn't work the same way String.contains() but I read that adding a .* at the beginning and end of the regex makes it act that way from here.

I would really appreciate it if someone could help me with this!

EDIT: An example in which I'm trying to check if a time exists in a String would be like, "The current time in London is 6:00 PM, what is the time in Toronto?", and it would return true because 6:00 PM is inside the String.
    
Answer: 
I used Pattern and Matcher for this answer....

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class IsTimeInString {

    public static void main(String args[]){

         String string = args[0];
         System.out.println(String.format("Is there a time in here:(%1$s)", string));
         Pattern p = Pattern.compile(".*([01]?[0-9]|2[0-3]):[0-5][0-9].*");
         Matcher m = p.matcher(string);
         if(m.matches()){
             System.out.println("Yes");
         }else{
             System.out.println("No.");
         }
    }


}


Sample outputs...    

$ java IsTimeInString "hi there"
Is there a time in here:(hi there)
No.

$ java IsTimeInString "hi there 2:15"
Is there a time in here:(hi there 2:15)
Yes

$ java IsTimeInString "hi there 14:15"
Is there a time in here:(hi there 14:15)
Yes

$ java IsTimeInString "hi there 24:15"
Is there a time in here:(hi there 24:15)
Yes

$ java IsTimeInString "hi there 25:15"
Is there a time in here:(hi there 25:15)
No.

$ java IsTimeInString "hi there 2:60"
Is there a time in here:(hi there 2:60)
No.

$ java IsTimeInString "hi there 2:15 PM"
