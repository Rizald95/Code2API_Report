package com.stackoverflow.api;

import javax.swing.*;

public class Human1988273 {

  public static JFrame getWebPage(String title, String url) throws Exception {
    JEditorPane website = new JEditorPane(url);
    website.setEditable(false);

    JFrame frame = new JFrame(title);
    frame.add(new JScrollPane(website));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();

    return frame;
  }
}
