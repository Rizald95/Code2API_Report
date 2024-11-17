Title: How do I compile and run a program in Java on my Mac?
Question: 
                
How do I compile and run a program in Java on my mac? 

I'm new.

Also I downloaded a program that was suggested to me on here called text wrangler if that has any bearing on the situation. 
    
Answer: 
Compiling and running a Java application on Mac OSX, or any major operating system, is very easy. Apple includes a fully-functional Java runtime and development environment out-of-the-box with OSX, so all you have to do is write a Java program and use the built-in tools to compile and run it.

Writing Your First Program

The first step is writing a simple Java program. Open up a text editor (the built-in TextEdit app works fine), type in the following code, and save the file as "HelloWorld.java" in your home directory.

public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello World!");
    }
}


For example, if your username is David, save it as "/Users/David/HelloWorld.java". This simple program declares a single class called HelloWorld, with a single method called main. The main method is special in Java, because it is the method the Java runtime will attempt to call when you tell it to execute your program. Think of it as a starting point for your program. The System.out.println() method will print a line of text to the screen, "Hello World!" in this example.

Using the Compiler

Now that you have written a simple Java program, you need to compile it. Run the Terminal app, which is located in "Applications/Utilities/Terminal.app". Type the following commands into the terminal:

cd ~
javac HelloWorld.java


You just compiled your first Java application, albeit a simple one, on OSX. The process of compiling will produce a single file, called "HelloWorld.class". This file contains Java byte codes, which are the instructions that the Java Virtual Machine understands.

Running Your Program

To run the program, type the following command in the terminal.

java HelloWorld


This command will start a Java Virtual Machine, and tell it to execute the HelloWorld class. The output of the program will be printed to the terminal.


If you want to run the program from within TextWrangler, you can do so by creating a new document, and then selecting "Run Bundle's Executable" from the "Run" menu. This will open up a dialog box asking you to select the Java executable, which is located at "/Library/Java/JavaVirtualMachines/1.8.0_111.jdk/Contents/Home/bin/java". After selecting the Java executable, you can select the HelloWorld.class file, and the program will run.