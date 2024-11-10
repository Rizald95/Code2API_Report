package com.chatgpt.api;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Chatgpt42159770 {
    public static void getPhotoDimensions(String filePath) throws IOException {
        BufferedImage imo;
        try {
            imo = ImageIO.read(new File(filePath));
            System.out.println(imo.getHeight());
            System.out.println(imo.getWidth());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
