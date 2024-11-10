package com.stackoverflow.api;

import javax.swing.*;

public class Human15694375 {

  public static void layout(
    JPanel mainPanel,
    JPanel paintPanel,
    JPanel textPanel
  ) {
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
    mainPanel.add(paintPanel);
    mainPanel.add(textPanel);
  }
}
