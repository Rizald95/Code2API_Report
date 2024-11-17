Title: How to convert char[] to string in java? [closed]
Question: 
                    
            
        
            
                
                    
                            
                                Closed. This question does not meet Stack Overflow guidelines. It is not currently accepting answers.
                                
                            
                    
                
            
        
            
        
            
                
                        
                            
                        
                     Questions asking for code must demonstrate a minimal understanding of the problem being solved. Include attempted solutions, why they didn't work, and the expected results. See also: Stack Overflow question checklist
                
                    
                        Closed 9 years ago.
                    
                

                
            
        
            
                    
                        Improve this question
                    
            


    


  char[] c = string.toCharArray();


but how to convert c back to String type?
thank you!
    
Answer: 
You can use String.valueOf(char[]):

String.valueOf(c)


Under the hood, this calls the String(char[]) constructor. I always prefer factory-esque methods to constructors, but you could have used new String(c) just as easily, as several other answers have suggested.



char[] c = {'x', 'y', 'z'};
String s = String.valueOf(c);

System.out.println(s);




xyz

    
Code: String.valueOf(c)

Complete the code as a full Java method.

    public static String charArrayToString(char[] c) {
        return String.valueOf(c);
    }




    public static void main(String[] args) {
        char[] c = {'x', 'y', 'z'};
        String s = charArrayToString(c);
        System.out.println(s);
    }




xyz



























































