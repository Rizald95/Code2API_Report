Title: How to open a Windows named pipe from Java?
Question: 
                
On our Linux system we use named pipes for interprocess communication (a producer and a consumer).

In order to test the consumer (Java) code, I would like to implement (in Java) a dummy producer which writes to a named pipe which is connected to the consumer.

Now the test should also work in the Windows development environment. Thus I would like to know how to create a named pipe in Windows from Java. In Linux I can use mkfifo (called using Runtime.exec() ), but how should I do this on Windows?
    
Answer: 
Use Named Pipes to Communicate Between Java and .Net Processes

Relevant part in the link

try {
  // Connect to the pipe
  RandomAccessFile pipe = new RandomAccessFile("\\\\.\\pipe\\testpipe", "rw");
  String echoText = "Hello word\n";
  // write to pipe
  pipe.write ( echoText.getBytes() );
  // read response
  String echoResponse = pipe.readLine();
  System.out.println("Response: " + echoResponse );
  pipe.close();
} catch (Exception e) {
  // TODO Auto-generated catch block
  e.printStackTrace();
}

    
Code: try {
  // Connect to the pipe
  RandomAccessFile pipe = new RandomAccessFile("\\\\.\\pipe\\testpipe", "rw");
  String echoText = "Hello word\n";
  // write to pipe
  pipe.write ( echoText.getBytes() );
  // read response
  String echoResponse = pipe.readLine();
  System.out.println("Response: " + echoResponse );
  pipe.close();
} catch (Exception e) {
  // TODO Auto-generated catch block
  e.printStackTrace();
}

Complete the code as a full Java method.

# Answer

Here is the complete the code as a full Java method.

try {
  // Connect to the pipe
  RandomAccessFile pipe = new RandomAccessFile("\\\\.\\pipe\\testpipe", "rw");
  String echoText = "Hello word\n";
  // write to pipe
  pipe.write ( echoText.getBytes() );
  // read response
  String echoResponse = pipe.readLine();
  System.out.println("Response: " + echoResponse );
  pipe.close();
} catch (Exception e) {
  // TODO Auto-generated catch block
  e.printStackTrace();
}

    
