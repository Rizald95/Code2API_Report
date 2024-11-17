Title: How to find time taken to run a Java program?
Question: 
                
I have a Java application that I've been working on and I just realized that the program has to return a value in less than a minute, but don't know how to find or display the time taken to run the program. How to find time taken to run a program?
    
Answer: 
You can compare times using System.nanoTime() . It will return the time in nanoseconds. 


  Returns the current value of the most precise available system timer, in nanoseconds.


You could use it like this:

long startTime = System.nanoTime();

// code

long endTime = System.nanoTime();
System.out.println("Took "+(endTime - startTime) + " ns"); 


Usefull links:


System.nanoTime()

    
Code: long startTime = System.nanoTime();

// code

long endTime = System.nanoTime();
System.out.println("Took "+(endTime - startTime) + " ns"); 

Complete the code as a full Java method.

```
public static void main(String[] args) {
    long startTime = System.nanoTime();

    // Your code here

    long endTime = System.nanoTime();
    System.out.println("Took "+(endTime - startTime) + " ns");
}
```

This code will print the time taken to run the code in nanoseconds.