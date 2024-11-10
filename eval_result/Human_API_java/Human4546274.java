package com.stackoverflow.api;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Human4546274 {

  public static void simulateMouseAndKeypress() {
    try {
      Robot robot = new Robot();
      robot.mousePress(InputEvent.BUTTON1_MASK);
      robot.mouseRelease(InputEvent.BUTTON1_MASK);
      robot.keyPress(KeyEvent.VK_SHIFT);
      robot.keyPress(KeyEvent.VK_TAB);
      robot.keyRelease(KeyEvent.VK_TAB);
      robot.keyRelease(KeyEvent.VK_SHIFT);
    } catch (AWTException e) {
      e.printStackTrace();
    }
  }
}
