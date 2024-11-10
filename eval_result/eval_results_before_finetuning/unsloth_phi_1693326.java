Title: How to create a JButton with a menu?
Question: 
                
I want to create a Toolbar in my application. If you click a button on that toolbar, it will pop up a menu, just like in Eclipse's toolbar. I don't know how to do this in Swing. Can someone help me please? I've tried Google but found nothing.
    
Answer: 
This is way harder in Swing than it needs to be. So instead of pointing you to tutorials I've created a fully working example.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ToolbarDemo {

    public static void main(String[] args) {
        final JFrame frame = new JFrame();
        frame.setPreferredSize(new Dimension(600, 400));
        final JToolBar toolBar = new JToolBar();

        //Create the popup menu.
        final JPopupMenu popup = new JPopupMenu();
        popup.add(new JMenuItem(new AbstractAction("Option 1") {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Option 1 selected");
            }
        }));
        popup.add(new JMenuItem(new AbstractAction("Option 2") {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Option 2 selected");
            }
        }));

        final JButton button = new JButton("Options");
        button.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                popup.show(e.getComponent(), e.getX(), e.getY());
            }
        });
        toolBar.add(button);

        frame.getContentPane().add(toolBar, BorderLayout.NORTH);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}














































































































































