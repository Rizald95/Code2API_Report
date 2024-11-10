package com.chatgpt.api;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Chatgpt5287521 {
    public static void putImageOnPanel(JPanel panel, String imagePath) {
        ImageIcon icon = new ImageIcon(imagePath);
        JLabel label = new JLabel();
        label.setIcon(icon);
        panel.add(label);
    }
}
