package com.stackoverflow.api;

import javax.swing.*;

public class Human5287521 {

  public static JPanel addImageToJPanel(String str1, JPanel panel) {
    ImageIcon icon = new ImageIcon(str1);
    JLabel label = new JLabel();
    label.setIcon(icon);
    panel.add(label);
    return panel;
  }
}
