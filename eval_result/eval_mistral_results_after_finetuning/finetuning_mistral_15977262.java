Title: How to append a byte to a string in Java?
Question: 
                
I have this operation I need to perform where I need to append a byte such as 0x10 to some String in Java. I was wondering how I could go about doing this?

For example:

String someString = "HELLO WORLD";
byte someByte = 0x10;


In this example, how would I go about appending someByte to someString?

The reason why I am asking this question is because the application I am developing is supposed to send commands to some server. The server is able to accept commands (base64 encoded), decode the command, and parse out these bytes that are not necessarily compatible with any sort of ASCII encoding standard for performing some special function.
    
Answer: 
If you want to concatenate the actual value of a byte to a String use the Byte wrapper and its toString() method, like this:

String someString = "STRING";
byte someByte = 0x10;
someString += Byte.toString(someByte);

    
Code: String someString = "STRING";
byte someByte = 0x10;
someString += Byte.toString(someByte);

Complete the code as a full Java method.

# Answer

You can use the Byte.toString(byte b) method.

String someString = "STRING";
byte someByte = 0x10;
someString += Byte.toString(someByte);


Complete the code as a full Java method.

# Answer

Here is the full Java method.

String someString = "STRING";
byte someByte = 0x10;
someString += Byte.toString(someByte);

System.out.println(someString);

# Answer

Here is the full Java method as a complete code the answer.

String someString = "STRING";
byte someByte =