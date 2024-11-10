package com.stackoverflow.api;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Human1693326 {

  public static void createJbuttonWithMenu(
    Dimension dimension,
    String buttonText,
    String optionName1,
    final String message1,
    String optionName2,
    final String message2
  ) {
    final JFrame frame = new JFrame();
    frame.setPreferredSize(dimension);
    final JToolBar toolBar = new JToolBar();

    //Create the popup menu.
    final JPopupMenu popup = new JPopupMenu();
    popup.add(
      new JMenuItem(
        new AbstractAction(optionName1) {
          public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame, message1);
          }
        }
      )
    );
    popup.add(
      new JMenuItem(
        new AbstractAction(optionName2) {
          public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame, message2);
          }
        }
      )
    );

    final JButton button = new JButton(buttonText);
    button.addMouseListener(
      new MouseAdapter() {
        public void mousePressed(MouseEvent e) {
          popup.show(e.getComponent(), e.getX(), e.getY());
        }
      }
    );
    toolBar.add(button);

    frame.getContentPane().add(toolBar, BorderLayout.NORTH);
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
