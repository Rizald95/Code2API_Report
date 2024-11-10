package com.stackoverflow.api;

import javax.swing.*;

public class Human4083850 {

  public static JTextArea createJTextArea(int width, String text) {
    JTextArea textArea = new JTextArea();
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);
    textArea.setText(text);
    System.out.println("000: " + textArea.getPreferredSize());
    textArea.setSize(width, 1);
    System.out.println(width + ": " + textArea.getPreferredSize());
    textArea.setSize(textArea.getPreferredSize());
    return textArea;
  }
}
