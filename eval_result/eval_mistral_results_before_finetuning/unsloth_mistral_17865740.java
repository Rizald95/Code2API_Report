Title: How do I draw an image to a JPanel or JFrame?
Question: 
                
How do I draw an Image to a JPanel or JFrame, I have already read oracle's tutorial on this but I can't seem to get it right. I need the image "BeachRoad.png" to be displayed on a specific set of coordinates. Here is what I have so far.

public class Level1  extends JFrame implements ActionListener {

static JLayeredPane EverythingButPlayer;
static Level1 l1;

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
                g.drawImage(image, 0, 0, null);
            }
        };

        frame.add(pane);
        frame.setVisible(true);
    }

    private static JFrame buildFrame() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        return frame;
    }
}

This code creates a JFrame, loads an image, and creates a JPanel that draws the image. The JPanel overrides the paint