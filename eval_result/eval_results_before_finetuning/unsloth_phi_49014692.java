Title: How to get stack trace in Processing debugger
Question: 
                
Is there any way to show a stack trace in the Processing 3 debugger (Java mode)? Not by catching an exception. I know about e.printStackTrace(). I want to print a stack trace in the debugger at a custom breakpoint.
Thanks!
    
Answer: 
I don't know of a way to view the stack in Processing's debugger. The Processing debugger is designed to be pretty barebones. If you really need this functionality, consider switching to a more advanced IDE like Eclipse or Intellij. Shameless self-promotion: here is a tutorial I wrote on using Processing in Java.
But one thing that you might try is manually printing out the stack trace by creating a new Exception:
new Exception().printStackTrace();

This will print out a stack trace to the console without actually throwing an exception. Put this line right before your break point to see the breakpoint's stack trace.
    
Code: new Exception().printStackTrace();

Complete the code as a full Java method.

Answer:
Certainly! Here's a Java method that you can use within Processing to manually print out a stack trace without throwing an exception. This method can be called before setting a breakpoint to inspect the call stack at that point in your code.

```java
public class DebugUtil {

    /**
     * Prints a stack trace to the console.
     * This method can be used to inspect the call stack at a specific point in your code.
     * It does not throw an exception but simply prints the current stack trace to the console.
     *
     * @param e The exception object used to obtain the stack trace.
     */
    public static void