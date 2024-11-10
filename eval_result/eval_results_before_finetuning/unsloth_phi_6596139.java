Title: how to find String contain any alphabetic or numeric characters using java? [duplicate]
Question: 
                    
            
        
            
                
                    
                            
                                This question already has answers here:
                                
                            
                    
                
            
                Closed 12 years ago.
        


    


  Possible Duplicate:
  Simple way to determine if string is only characters, or to check if string contains any numbers in Java  




I want to find if a given String has any alphabetic or numeric characters. How would I do this using java?

Thanks
    
Answer: 
String s = "%$a*";
Pattern p = Pattern.compile("[a-zA-Z0-9]");
Matcher m = p.matcher(s);
if (m.find())
  System.out.println("The string \"" + s + "\" contains alphanumerical characters.");

    
Code: String s = "%$a*";
Pattern p = Pattern.compile("[a-zA-Z0-9]");
Matcher m = p.matcher(s);
if (m.find())
  System.out.println("The string \"" + s + "\" contains alphanumerical characters.");

Complete the code as a full Java method.

Here's a complete Java method that checks if a given string contains any alphabetic or numeric characters:

```java
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringContainsAlphanumeric {

    public static boolean containsAlphanumeric(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        Pattern pattern = Pattern.compile("[a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(input);

        return matcher.find();
    }

    public static void main