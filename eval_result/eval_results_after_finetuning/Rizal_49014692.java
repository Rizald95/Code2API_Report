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

# Answer
You can print the stack trace by creating a new Exception and calling its printStackTrace method:

public class Test {
    public static void main(String[] args) {
        StringStackTrace ss = new Exception().toString().split("\\]");
        System.out.println(ss[0].substring(4));
    }
}


Code: StringStackTrace ss = new Exception().toString().split("\\]");
        System.out.println(ss[0].substring(4));

    
Complete the code as a full Java method.

# Answer
You can print the stack trace by creating a new Exception and calling its printStackTrace method:
