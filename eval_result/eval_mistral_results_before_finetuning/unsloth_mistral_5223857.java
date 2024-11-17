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

```
public static int countOccurrences(String input) {
    int index = input.indexOf("is");
    int count = 0;
    while (index != -1) {
        count++;
        input = input.substring(index + 1);
        index = input.indexOf("is");
    }
    return count;
}
```

This method takes a string as input, initializes a counter to 0, and then uses a while loop to find the index of the first occurrence of "is" in the input string. It then increments the counter, removes the substring from the input string starting from the index of