

public Level1() {
    EverythingButPlayer = new JLayeredPane();

    BufferedImage img = null;
    try {
        img = ImageIO.read(new File("BeachRoad.png"));
    } catch (IOException e) {
    }
    Graphics g = img.getGraphics();
    g.drawImage(img,0, 0, EverythingButPlayer);


    this.add(EverythingButPlayer);
}


And in the Main(),

l1 = new Level1();
l1.setTitle("poop");
l1.setSize(1920, 1080);
l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
l1.setVisible(true);


Thanks in advance!
    
Answer: 
Try this:

package com.sandbox;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SwingSandbox {

    public static void main(String[] args) throws IOException {
        JFrame frame = buildFrame();

        final BufferedImage image = ImageIO.read(new File("C:\\Projects\\MavenSandbox\\src\\main\\resources\\img.jpg"));

        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, this);
            }
        };

        frame.add(pane);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    private static JFrame buildFrame() {
        JFrame frame = new JFrame();
        frame.setTitle("Image Example");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;