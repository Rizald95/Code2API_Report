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

# Answer
You can create the method as follows:

    import java.util.regex.Matcher;
    import java.util.regex.Pattern;
    
    public class Main {
    
        public static void main(String[] args) {
            String s = "%$a*";
            if (containsAlphanumeric(s))
                System.out.println("The string \"" + s + "\" contains alphanumerical characters.");
            else
                System.out.println("The string \"" + s + "\" contains no alphanumerical characters.");
        }
        
        public static boolean containsAlphanumeric(String s)