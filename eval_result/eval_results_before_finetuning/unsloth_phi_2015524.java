Title: How to view the current heap size that an application is using?
Question: 
                
I think I increased my heap size to 1 GB in NetBeans since I changed the config to look like this:

netbeans_default_options="-J-Xmx1g ......


After I restarted NetBeans, can I be sure that my app is given 1 GB now?

Is there a way to verify this?
    
Answer: 
Use this code:

// Get current size of heap in bytes
long heapSize = Runtime.getRuntime().totalMemory(); 

// Get maximum size of heap in bytes. The heap cannot grow beyond this size.// Any attempt will result in an OutOfMemoryException.
long heapMaxSize = Runtime.getRuntime().maxMemory();

 // Get amount of free memory within the heap in bytes. This size will increase // after garbage collection and decrease as new objects are created.
long heapFreeSize = Runtime.getRuntime().freeMemory(); 


It was useful to me to know it.
    
Code: // Get current size of heap in bytes
long heapSize = Runtime.getRuntime().totalMemory(); 

// Get maximum size of heap in bytes. The heap cannot grow beyond this size.// Any attempt will result in an OutOfMemoryException.
long heapMaxSize = Runtime.getRuntime().maxMemory();

 // Get amount of free memory within the heap in bytes. This size will increase // after garbage collection and decrease as new objects are created.
long heapFreeSize = Runtime.getRuntime().freeMemory(); 

Complete the code as a full Java method.


Answer:

Here is a complete Java method that you can use to check the current heap size, the maximum heap size, and the amount of free memory within the heap:

```java
public class HeapSizeChecker {

    public static void main(String[] args) {
        checkHeapSize();
    }

    public static void checkHeapSize() {
        // Get current size of heap in bytes
        long heapSize = Runtime.getRuntime().totalMemory();
        System.out.println("Current heap size: " + heapSize + " bytes");

        // Get maximum size of heap in bytes. The heap cannot grow beyond this size