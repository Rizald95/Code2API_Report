Title: How to read input with multiple lines in Java
Question: 
                
Our professor is making us do some basic programming with Java, he gave a website and everything to register and submit our questions, for today I need to do this one example I feel like I'm on the right track but I just can't figure out the rest. Here is the actual question:

**Sample Input:**
10 12
10 14
100 200

**Sample Output:**
2
4
100


And here is what I've got so far :

public class Practice {

    public static int calculateAnswer(String a, String b) {
        return (Integer.parseInt(b) - Integer.parseInt(a));
    }

    public static void main(String[] args) {
        System.out.println(calculateAnswer(args[0], args[1]));
    }
}


Now I always get the answer 2 because I'm reading the single line, how can I take all lines into account? thank you

For some strange reason every time I want to execute I get this error:

C:\sonic>java Practice.class 10 12
Exception in thread "main" java.lang.NoClassDefFoundError: Fact
Caused by: java.lang.ClassNotFoundException: Fact.class
        at java.net.URLClassLoader$1.run(URLClassLoader.java:20
        at java.security.AccessController.doPrivileged(Native M
        at java.net.URLClassLoader.findClass(URLClassLoader.jav
        at java.lang.ClassLoader.loadClass(ClassLoader.java:307
        at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.
        at java.lang.ClassLoader.loadClass(ClassLoader.java:248
Could not find the main class: Practice.class.  Program will exit.


Whatever version of answer I use I get this error, what do I do ?

However if I run it in eclipse Run as > Run Configuration -> Program arguments 

10 12
10 14
100 200

it works fine.

Answer: 

You can use the Scanner class to read input line by line.

You can try the following code:

import java.util.Scanner;

public class Practice {

    public static int calculateAnswer(String a, String b) {
        return (Integer.parseInt(b) - Integer.parseInt(a));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(calculateAnswer(scan.nextLine(), scan.nextLine()));
        System.out.println(calculateAnswer(scan.nextLine