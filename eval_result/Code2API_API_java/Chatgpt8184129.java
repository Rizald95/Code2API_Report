package com.chatgpt.api;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.net.URL;

public class Chatgpt8184129 {
    public static String getImageSize(String imageUrl) throws Exception {
        URL url = new URL(imageUrl);
        BufferedImage bi = ImageIO.read(url);
        String size = bi.getWidth() + "x" + bi.getHeight();
        return size;
    }
}
