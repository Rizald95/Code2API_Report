package com.stackoverflow.api;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class Human3035893 {

  public static JFrame createBar(String text) {
    JFrame frame = new JFrame();
    frame.setLayout(new BorderLayout());
    frame.setSize(200, 200);

    // create the status bar panel and shove it down the bottom of the frame
    JPanel statusPanel = new JPanel();
    statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
    frame.add(statusPanel, BorderLayout.SOUTH);
    statusPanel.setPreferredSize(new Dimension(frame.getWidth(), 16));
    statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));
    JLabel statusLabel = new JLabel(text);
    statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
    statusPanel.add(statusLabel);

    frame.setVisible(true);
    return frame;
  }
}
