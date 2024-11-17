Title: How to add delay to while loop [duplicate]
Question: 
                    
            
        
            
                
                    
                            
                                This question already has answers here:
                                
                            
                    
                
            
                    
                        Wait function in Java
                            
                                (6 answers)
                            
                    
                Closed 8 years ago.
        


    

I have a while loop and what I want it to do is every 1 second count up an integer up to 10.
The code that I have now simply spits out 1-10 as quick as it possibly can with no delay, I'm un-sure how to add a delay.
      package apackage;

public class loops {
    public static void main(String args[]){
        int countdown = 1;
        while (countdown < 10) {
            System.out.println(countdown);
            ++countdown;
        }
    }
} 


So, thanks for reading and appreciate the help in advance.
    
Answer: 
Change your code to this

public class loops {
    public static void main(String args[]) throws InterruptedException {
        int countdown = 1;
        while (countdown < 10){
            System.out.println(countdown);
            ++countdown;
            Thread.sleep(1000);
        }
    }
} 

    
Code: public class loops {
    public static void main(String args[]) throws InterruptedException {
        int countdown = 1;
        while (countdown < 10){
            System.out.println(countdown);
            ++countdown;
            Thread.sleep(1000);
        }
    }
} 

Complete the code as a full Java method.

public class loops {
    public static void main(String args[]) throws InterruptedException {
        int countdown = 1;
        while (countdown < 10){
            System.out.println(countdown);
            ++countdown;
            Thread.sleep(1000);
        }
    }
}

This code will print the numbers 1 to 10 with a 1 second delay between each number.

The `Thread.sleep(1000)` method is used to pause the execution of the program for 1000 milliseconds (or 1 second).

The `InterruptedException` is thrown when