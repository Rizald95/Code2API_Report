Title: How do I count the number of times a sequence occurs in a Java string? [closed]
Question: 
                    
            
        
            
                
                    
                            
                                Closed. This question does not meet Stack Overflow guidelines. It is not currently accepting answers.
                                
                            
                    
                
            
        
            
        
            
                
                        
                            
                        
                     Questions asking for code must demonstrate a minimal understanding of the problem being solved. Include attempted solutions, why they didn't work, and the expected results. See also: Stack Overflow question checklist
                
                    
                        Closed 9 years ago.
                    
                

                
            
        
            
                    
                        Improve this question
                    
            


    

I have a String that looks like:

"Hello my is Joeseph. It is very nice to meet you. What a wonderful day it is!". 


I want to count the number of times is is in the string. 

How can I do this in Java?
    
Answer: 
int index = input.indexOf("is");
int count = 0;
while (index != -1) {
    count++;
    input = input.substring(index + 1);
    index = input.indexOf("is");
}
System.out.println("No of *is* in the input is : " + count);

    
Code: int index = input.indexOf("is");
int count = 0;
while (index != -1) {
    count++;
    input = input.substring(index + 1);
    index = input.indexOf("is");
}
System.out.println("No of *is* in the input is : " + count);

Complete the code as a full Java method.

# Answer

You can use the indexOf() method in Java to find the position of the string you mentioned. Then you can use a while loop to count the number of times the string is present in the given string.

Here is the complete the code as a full Java method.

int index = input.indexOf("is");
int count = 0;
while (index != -1) {
    count++;
    input = input.substring(index + 1);
    index = input.indexOf("is");
}
System.out.println("No of *is* in the input is : " + count);

    
Code the full Java method as a