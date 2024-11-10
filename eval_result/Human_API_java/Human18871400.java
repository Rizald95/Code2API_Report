package com.stackoverflow.api;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Human18871400 {

  public static void loadImgInFrame(String path) {
    File file = new File(path);
    BufferedImage image = ImageIO.read(file);
    JLabel label = new JLabel(new ImageIcon(image));
    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.getContentPane().add(label);
    f.pack();
    f.setLocation(200, 200);
    f.setVisible(true);
  }
}
