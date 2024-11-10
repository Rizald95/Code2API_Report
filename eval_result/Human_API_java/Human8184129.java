package com.stackoverflow.api;

import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Human8184129 {

  public static void printImageHeighthAndWidth(URL url) {
    BufferedImage bi = ImageIO.read(url);
    String size = bi.getWidth() + "x" + bi.getHeight();
    SwingUtilities.invokeLater(
      new Runnable() {
        @Override
        public void run() {
          JLabel l = new JLabel(size, new ImageIcon(bi), SwingConstants.RIGHT);
          JOptionPane.showMessageDialog(null, l);
        }
      }
    );
  }
}
