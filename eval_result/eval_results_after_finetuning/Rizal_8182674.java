Title: How to have a Scrollable JTextPane?
Question: 
                
I would like to have a JTextPane that have scroll bar, how can I do so ? Thanks. 
    
Answer: 
To insert a scroll bar on your new JTextPane, just use a JScrollPane:

JTextPane txt = new JTextPane();

JScrollPane jsp = new JScrollPane(txt);


JTextPane API: http://download.oracle.com/javase/6/docs/api/javax/swing/JTextPane.html

JScrollPane API: http://download.oracle.com/javase/6/docs/api/javax/swing/JScrollPane.html

If you have some issues, take a look at this SO question : 
Java JTextPane JScrollPane Display Issue

Or take a look at: http://www.daniweb.com/software-development/java/threads/30283
    
Code: JTextPane txt = new JTextPane();

JScrollPane jsp = new JScrollPane(txt);

Complete the code as a full Java method.

# Answer
You can create a JTextPane with a scroll bar by placing the JTextPane inside a JScrollPane. Here is how you can do it as a full Java method:

```java
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class Main {
    public static void main(String[] args) {
        // Create a JTextPane
        JTextPane txt = new JTextPane();
        
        // Create a JScrollPane and pass the JTextPane to it
        JScrollPane jsp = new JScrollPane(txt);
        
        // You can now add the JScrollPane to