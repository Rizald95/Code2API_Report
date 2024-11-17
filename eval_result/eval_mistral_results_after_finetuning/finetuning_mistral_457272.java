Title: How to cause soft references to be cleared in Java?
Question: 
                
I have a cache which has soft references to the cached objects. I am trying to write a functional test for behavior of classes which use the cache specifically for what happens when the cached objects are cleared.

The problem is: I can't seem to reliably get the soft references to be cleared. Simply using up a bunch of memory doesn't do the trick: I get an OutOfMemory before any soft references are cleared.

Is there any way to get Java to more eagerly clear up the soft references?



Found here: 


  "It is guaranteed though that all
  SoftReferences will get cleared before
  OutOfMemoryError is thrown, so they
  theoretically can't cause an OOME."


So does this mean that the above scenario MUST mean I have a memory leak somewhere with some class holding a hard reference on my cached object?
    
Answer: 

  The problem is: I can't seem to
  reliably get the soft references to be
  cleared.


This is not unique to SoftReferences.  Due to the nature of garbage collection in Java, there is no guarantee that anything that is garbage-collectable will actually be collected at any point in time.  Even with a simple bit of code:

Object temp = new Object();
temp = null;
System.gc();

there is no guarantee that the Object instantiated in the first line is garbage collected at this, or in fact any point.  It's simply one of the things you have to live with in a memory-managed language, you're giving up declarative power over these things.  And yes, that can make it hard to definitively test for memory leaks at times.



That said, as per the Javadocs you quoted, SoftReferences should definitely be cleared before an OutOfMemoryError is thrown (in fact, that's the entire point of them and the only way they differ from the default object references).  It would thus sound like there is some sort of memory leak in that you're holding onto harder references to the objects in question.

If you use the -XX:+HeapDumpOnOutOfMemoryError option to the JVM, and then examine the heap dump with a tool like VisualVM, you should be able to see exactly what objects are being held onto at the time of the OOME.
    
Code: Object temp = new Object();
temp = null;
System.gc();

Complete the code as a full Java method.

# Answer

You can try to force garbage collection and finalize the soft references:

SoftReference sr1 = new SoftReference(new Object());
SoftReference sr2 = new SoftReference(new Object());

System.gc();

System.runFinalization();

    
Code SoftReference sr1 = new SoftReference(new Object());
SoftReference