Title: How does Java's System.exit() work with try/catch/finally blocks? [duplicate]
Question: 
                    
            
        
            
                
                    
                            
                                This question already has answers here:
                                
                            
                    
                
            
                    
                        Does a finally block always get executed in Java?
                            
                                (52 answers)
                            
                    
                Closed 6 years ago.
        


    

I'm aware of headaches that involve returning in try/catch/finally blocks - cases where the return in the finally is always the return for the method, even if a return in a try or catch block should be the one executed.

However, does the same apply to System.exit()? For example, if I have a try block:

try {
    //Code
    System.exit(0)
}
catch (Exception ex) {
    //Log the exception
}
finally {
    System.exit(1)
}


If there are no exceptions, which System.exit() will be called? If the exit was a return statement, then the line System.exit(1) would always (?) be called. However, I'm not sure if exit behaves differently than return.

The code is in an extreme case that is very difficult, if not impossible, to reproduce, so I can't write a unit test. I'm going to try to run an experiment later today, if I get a few free minutes, but I'm curious anyway, and perhaps someone on SO knows the answer and can provide it before or in case I can't run an experiment.
    
Answer: 
No. System.exit(0) doesn't return, and the finally block is not executed.

System.exit(int) can throw a SecurityException. If that happens, the finally block will be executed. And since the same principal is calling the same method from the same code base, another SecurityException is likely to be thrown from the second call.



Here's an example of the second case:

import java.security.Security;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;

public class Test {
    public static void main(String[] args) {
        Security.setAccessControlException(
            new SecurityException("Test")
        );

        AccessController.doPrivileged(
            new PrivilegedExceptionAction<Void>() {
                public Void run() throws Exception {
                    System.setSecurityManager(new SecurityManager());
                    System.exit(0);
                    return null;
                }
            }
        );

        System.out.println("After System.exit");
   