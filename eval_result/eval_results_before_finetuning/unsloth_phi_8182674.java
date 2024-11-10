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

Answer:

Here is a complete Java method that creates a JTextPane with a JScrollPane to allow scrolling:

```java
import javax.swing.*;
import java.awt.*;

public class ScrollableTextPaneExample {

    public static void main(String[] args) {
        // Create a JTextPane
        JTextPane textPane = new JTextPane();
        
        // Create a JScrollPane with the JTextPane as its content
        JScrollPane scrollPane = new JScrollPane(textPane);
        
        // Set the preferred size of the JTextPane if needed
        textPane.setPreferredSize(new Dimension