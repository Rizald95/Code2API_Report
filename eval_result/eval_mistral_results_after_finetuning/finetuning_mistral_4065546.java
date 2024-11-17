Title: Java: How to get the caller function name
Question: 
                
To fix a test case I need to identify whether the function is called from a particular caller function. I can't afford to add a boolean parameter because it would break the interfaces defined. How to go about this?

This is what I want to achieve. Here I can't change the parameters of operation() as it is an interface implementation.

operation()
{
   if not called from performancetest() method
       do expensive bookkeeping operation
   ...       

}

    
Answer: 
You could try

StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
StackTraceElement e = stacktrace[2];//maybe this number needs to be corrected
String methodName = e.getMethodName();

    
Code: StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
StackTraceElement e = stacktrace[2];//maybe this number needs to be corrected
String methodName = e.getMethodName();

Complete the code as a full Java method.

# Answer

You could try

StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
StackTraceElement e = stacktrace[2];//maybe this number needs to be corrected
String methodName = e.getMethodName();

Complete the code as a full Java method.

# Answer

You could try

StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
StackTraceElement e = stacktrace[2];//maybe this number needs to be corrected
String methodName = e.getMethodName();

Complete the code as a full Java method.

# Answer

You could try

StackTraceElement[] stacktrace = Thread.current