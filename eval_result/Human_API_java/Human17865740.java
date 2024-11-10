package com.stackoverflow.api;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Human17865740 {

  public static JFrame drawImage(String str1) throws IOException {
    JFrame frame = buildFrame();

    BufferedImage image = ImageIO.read(new File(str1));

    JPanel pane = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
      }
    };

    frame.add(pane);
    return frame;
  }

  private static JFrame buildFrame() {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setSize(200, 200);
    frame.setVisible(true);
    return frame;
  }
}
