Title: How to iterate through a String [duplicate]
Question: 
                    
            
        
            
                
                    
                            
                                This question already has answers here:
                                
                            
                    
                
            
                    
                        What is the easiest/best/most correct way to iterate through the characters of a string in Java?
                            
                                (16 answers)
                            
                    
                Closed 8 years ago.
        


    

How can I iterate through a string in Java?

I'm trying to use a foreach style for loop

for (char x : examplestring) {
    //action
}

    
Answer: 
If you want to use enhanced loop, you can convert the string to charArray

for (char ch : exampleString.toCharArray()) {
  System.out.println(ch);
}

    
Code: for (char ch : exampleString.toCharArray()) {
  System.out.println(ch);
}

Complete the code as a full Java method.

Here's a complete Java method that iterates through a string using the enhanced for loop:

```java
public class StringIterator {

    public static void iterateString(String exampleString) {
        // Convert the string to a char array
        char[] charArray = exampleString.toCharArray();

        // Iterate through the char array using the enhanced for loop
        for (char ch : charArray) {
            System.out.println(ch);
        }
    }

    public static void main(String[] args) {
        // Example usage of the iterateString method
        String exampleString = "Hello, World!";
       