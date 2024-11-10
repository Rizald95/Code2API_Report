package com.stackoverflow.api;

import javax.swing.UIManager;

public class Human2592258 {

  public static void setPlatformLookAndFeel() {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
