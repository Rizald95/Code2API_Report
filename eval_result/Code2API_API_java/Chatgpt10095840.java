package com.chatgpt.api;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Chatgpt10095840 {
    public static void resizeImageAndRemoveBackground(String imagePath, String outputDirectory, String outputFileName) throws IOException {
        FileInputStream item = new FileInputStream(imagePath);
        File uploadedFile = new File(outputDirectory + outputFileName);
        BufferedImage bi = ImageIO.read(item);
        Image img = bi.getScaledInstance(125, 125, Image.SCALE_SMOOTH);
        BufferedImage img_logo = new BufferedImage(125, 125, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = img_logo.createGraphics();
        g.drawImage(img, 0, 0, null);
        if (g != null) {
            g.dispose();
        }
        uploadedFile.getParentFile().mkdirs();
        uploadedFile.createNewFile();
        ImageIO.write(img_logo, "png", uploadedFile);
    }
}
