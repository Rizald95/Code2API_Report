Title: How do I load images in Jframe java(eclipse)?
Question: 
                
I have an paneel.java file which looks like the following code:
import java.awt.*;
import javax.swing.*;

public class Paneel extends JFrame
{
    public static void main ( String [] args )
    {
        // frame
        JFrame frame = new Paneel();
        frame.setSize ( 1000, 1000 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setTitle( "Remembory" );
        frame.setVisible( true );
    }
    
    class Gifpaneel extends JPanel{
        private ImageIcon gif, animatedGif;
        
        public Gifpaneel() {
            gif = new ImageIcon( "test.gif" );
            animatedGif = new ImageIcon( "animaties/test.gif" );
        }       
        
        public void paintComponent( Graphics g ){
            super.paintComponent( g );
            
            gif.paintIcon( this, g, 100, 100 );
            animatedGif.paintIcon ( this, g, 250, 100 );
        }
        
    }
}

I would like to show the test.gif file.
How do I get this done? because when I run it in eclipse I only get the jframe with no image in it.
    
Answer: 
Use this

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ImageInFrame {
    public static void main(String[] args) throws IOException {
        String path = "Image1.jpg";
        File file = new File(path);
        BufferedImage image = ImageIO.read(file);
        JLabel label = new JLabel(new ImageIcon(image));
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(label);
        f.pack();
        f.setSize(300, 300);
        f.setVisible(true);
    }
}

A: You can use a JLabel to display an image.
Here is a simple example:
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame