Title: How to stop text going grey when disabling a button?
Question: 
                
My current java version is:

$java -version
 java version 1.8.0_40


I'm very new to swing and trying to write my first minesweeper app. Now, I need to disable a button when clicking on it and print a number of adjacent mines (with the appropriate text color depending on a number: 1- blue, 2 - green, 3 - red, etc). So as suggested in this answer I wrote the following:

JFrame frame = new JFrame("Hello swing");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel panel = new JPanel();
JButton button = new JButton();
button.addActionListener((ActionEvent ev) -> { 
                        button.setSelected(true);  
                        button.setText("<html><font color = red>3</font></html>");
                        button.setEnabled(false); });


But it still goes grey when disabling:



But enabled button look just as I want it to:



What to do with this issue? How to fix this problem with disabling buttons?
    
Answer: 

  Maybe you know some workarounds


Use Icons instead of text. 

Then you can use:

JButton button = new JButton( icon3 );
button.setDisabledIcon( icon3 );

    
Code: JButton button = new JButton( icon3 );
button.setDisabledIcon( icon3 );

Complete the code as a full Java method.



Here's a complete example using icons:

```java
import javax.swing.*;
import javaaine.awt.*;
import java.awt.event.*;

public class MinesweeperButton {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Minesweeper");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton button = new JButton(createMineIcon());
        button.setActionCommand("click");
        button.addActionListener(new ActionListener() {
            @Override