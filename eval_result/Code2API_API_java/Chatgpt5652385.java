package com.chatgpt.api;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.awt.FontFormatException;

public class Chatgpt5652385 {
    public static void addCustomFontToSystem(String fontFilePath) throws IOException, FontFormatException {
        try {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(fontFilePath)));
        } catch (IOException | FontFormatException e) {
            //Handle exception
        }
    }
}
