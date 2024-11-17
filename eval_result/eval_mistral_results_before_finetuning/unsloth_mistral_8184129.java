Title: How can I get height and width of an image?
Question: 
                
Why is the following bit of code returns Height: -1 which means that the height is yet not known. How to get height of the image?

 try {
        // Create a URL for the image's location
        URL url = new URL("http://bmw-2006.auto-one.co.uk/wp-content/uploads/bmw-m3-2006-3.jpg");

        // Get the image
        java.awt.Image image = Toolkit.getDefaultToolkit().createImage(url);

        System.out.println("Height: " + image.getHeight(null));


    } catch (MalformedURLException e) {
    } catch (IOException e) {
    }

    
Answer: 
Use ImageIO.read(URL) or ImageIO.read(File) instead.  It will block while loading, and the image width & height will be known after it returns.
E.G.

import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.net.URL;

class SizeOfImage {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://i.stack.imgur.com/7bI1Y.jpg");
        final BufferedImage bi = ImageIO.read(url);
        final String size = bi.getWidth() + "x" + bi.getHeight();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JLabel l = new JLabel( 
                    size, 
                    new ImageIcon(bi), 
                    SwingConstants.RIGHT );
                JOptionPane.showMessageDialog(null, l);
            }
        });
    }
}

Alternately, add a MediaTracker to the image being loaded asynchronously by the Toolkit and wait until it is completely loaded.
    
Code: import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.net.URL;
import java.awt.MediaTracker;

class SizeOfImage {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://i.stack.imgur.com/7bI1Y.jpg");
        final BufferedImage bi = ImageIO.read(url);
        final MediaTracker mt = new MediaTracker(new JLabel());
        mt.addImage(bi, 0);
        mt.waitForAll();
        final String size = bi.getWidth() + "x" + bi.getHeight();
        SwingUtilities.invokeLater(new Runn