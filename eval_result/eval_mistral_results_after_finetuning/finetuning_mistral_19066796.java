Title: How to find vowels in a string in java program [closed]
Question: 
                    
            
        
            
                
                    
                            
                                Closed. This question does not meet Stack Overflow guidelines. It is not currently accepting answers.
                                
                            
                    
                
            
        
            
        
            
                
                        
                            
                        
                     Questions concerning problems with code you've written must describe the specific problem — and include valid code to reproduce it — in the question itself. See SSCCE.org for guidance.
                
                    
                        Closed 9 years ago.
                    
                

                
            
        
            
                    
                        Improve this question
                    
            


    

What is the java coding to find out vowels in a string?
How to use OR operator in java? 
because the symbol " || " is not taken while i executing the java program.
    
Answer: 
try the below code 
The program  iterats over the given string and check if each character is an vowel
1. The symbol '||' can be used as OR, below program is an example

  public class Test {

    public static void main(String[] args) {    
        String str ="This is a test";
        for(int i=0;i <str.length();i++){
            if((str.charAt(i) == 'a') || 
                (str.charAt(i) == 'e')  ||
                (str.charAt(i) == 'i') || 
                (str.charAt(i) == 'o') ||
                (str.charAt(i) == 'u')) {
                System.out.println(" The String contains " + str.charAt(i));
            }
        }
    }
    }


Note: it will match only lower case vowels
    
Code:   public class Test {

    public static void main(String[] args) {
        String str ="This is a test";
        for(int i=0;i <str.length();i++){
            if((str.charAt(i) == 'a') ||
                (str.charAt(i) == 'e')  ||
                (str.charAt(i) == 'i') ||
                (str.charAt(i) == 'o') ||
                (str.charAt(i) == 'u')) {
                System.out.println(" The String contains " + str.charAt(i));
            }
        }