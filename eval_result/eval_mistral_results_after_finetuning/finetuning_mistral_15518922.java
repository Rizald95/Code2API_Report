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

You can try this :

Pattern p = Pattern.compile("http://www.\\.com");
Matcher m = p.matcher("http://www.google.com");
boolean b = m.lookingAt();

    
Code: Pattern p = Pattern.compile("http://www.\\.com");
Matcher m = p.matcher("http://www.google.com");
boolean b = m.lookingAt();

Complete the code as a full Java method.

# Answer

You can use POSIX character classes (see here):

Pattern p = Pattern.compile("http://www.\\.com");
Matcher m