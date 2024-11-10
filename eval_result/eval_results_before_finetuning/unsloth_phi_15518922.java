Title: How to validate URL in java using regex? [duplicate]
Question: 
                    
            
        
            
                
                    
                            
                                This question already has answers here:
                                
                            
                    
                
            
                    
                        What is the best regular expression to check if a string is a valid URL?
                            
                                (64 answers)
                            
                    
                Closed 10 years ago.
        


    

I want to validate url started with http/https/www/ftp and checks for /\ slashes and checks for .com,.org etc at the end of URL using regular expression. Is there any regex patttern for URL validation?
    
Answer: 
This works:

Pattern p = Pattern.compile("(@)?(href=')?(HREF=')?(HREF=\")?(href=\")?(http://)?[a-zA-Z_0-9\\-]+(\\.\\w[a-zA-Z_0-9\\-]+)+(/[#&\\n\\-=?\\+\\%/\\.\\w]+)?");  

    Matcher m = p.matcher("your url here"); 

    
Code: Pattern p = Pattern.compile("(@)?(href=')?(HREF=')?(HREF=\")?(href=\")?(http://)?[a-zA-Z_0-9\\-]+(\\.\\w[a-zA-Z_0-9\\-]+)+(/[#&\\n\\-=?\\+\\%/\\.\\w]+)?");  

    Matcher m = p.matcher("your url here"); 

Complete the code as a full Java method.


# Answer 

Here's a Java method that uses the provided regex pattern to validate a URL:

```java
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class URLValidator {

    public static boolean isValidURL(String url) {
        // The regex pattern to validate a URL
        String regex = "@?(href=')?(HREF=')?(HREF=\")?(href=\")?(http://)?[a-zA-Z_0-9-]+(\\.[a-zA-Z_0-9-]+)*(\\.[a-zA-Z]{2,})?(/