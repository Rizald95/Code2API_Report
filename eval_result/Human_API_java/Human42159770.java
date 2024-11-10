package com.stackoverflow.api;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Human42159770 {

  public static void printDimensionsOfBufferedImage(BufferedImage imo) {
    try {
      imo = ImageIO.read(new File("location_of_file"));
      System.out.println(imo.getHeight());
      System.out.println(imo.getWidth());
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
