package com.stackoverflow.api;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Human5652385 {

  public static void registerFont(String str1) {
    try {
      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(str1)));
    } catch (IOException | FontFormatException e) {
      //Handle exception
    }
  }
}
