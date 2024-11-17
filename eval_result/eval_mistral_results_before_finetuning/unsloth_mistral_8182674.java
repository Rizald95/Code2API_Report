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

```
import javax.swing.*;
import java.awt.*;

public class ScrollableTextPane {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Scrollable Text Pane");
                frame.setSize(600, 400);
                frame.setLocationRelativeTo(null);

                JTextPane txt = new