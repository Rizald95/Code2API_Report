Title: How to gracefully handle the SIGKILL signal in Java
Question: 
                
How do you handle clean up when the program receives a kill signal? 

For instance, there is an application I connect to that wants any third party app (my app) to send a finish command when logging out. What is the best say to send that finish command when my app has been destroyed with a kill -9?

edit 1: kill -9 cannot be captured. Thank you guys for correcting me. 

edit 2: I guess this case would be when the one calls just kill which is the same as ctrl-c
    
Answer: 
It is impossible for any program, in any language, to handle a SIGKILL. This is so it is always possible to terminate a program, even if the program is buggy or malicious.  But SIGKILL is not the only means for terminating a program. The other is to use a SIGTERM. Programs can handle that signal. The program should handle the signal by doing a controlled,  but rapid, shutdown. When a computer shuts down, the final stage of the shutdown process sends every remaining process a SIGTERM, gives those processes a few seconds grace, then sends them a SIGKILL.

The way to handle this for anything other than kill -9 would be to register a shutdown hook. If you can use (SIGTERM) kill -15 the shutdown hook will work. (SIGINT) kill -2 DOES cause the program to gracefully exit and run the shutdown hooks.


  Registers a new virtual-machine shutdown hook.
  
  The Java virtual machine shuts down in response to two kinds of events:
  
  
  The program exits normally, when the last non-daemon thread exits or when the exit (equivalently, System.exit) method is invoked, or
  The virtual machine is terminated in response to a user interrupt, such as typing ^C, or a system-wide event, such as user logoff or system shutdown.
  


I tried the following test program on OSX 10.6.3 and on kill -9 it did NOT run the shutdown hook, as expected. On a kill -15 it DOES run the shutdown hook.

    
    
    public class ShutdownTest {
    
        static Thread shutdownThread;
    
        static void shutdownHook() {
            System.out.println("shutdownHook()");
        }
    
        public static void main(String[] args) {
            System.out.println("Before:");
            shutdownThread = new Thread(new Runnable() {
    
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                   