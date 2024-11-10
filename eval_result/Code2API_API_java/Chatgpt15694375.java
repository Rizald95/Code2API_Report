package com.chatgpt.api;
import javax.swing.*;
import java.awt.*;

public class Chatgpt15694375 {
    public static void setLayoutForPanels() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JPanel paintPanel = new JPanel();
        JPanel textPanel = new JPanel();

        mainPanel.add(paintPanel);
        mainPanel.add(textPanel);
    }
}
