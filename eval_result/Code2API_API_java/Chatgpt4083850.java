package com.chatgpt.api;
import javax.swing.JTextArea;

public class Chatgpt4083850 {
    public static int getMinimumHeightTextArea(int width, String text) {
        JTextArea textArea = new JTextArea();
        textArea.setLineWrap( true );
        textArea.setWrapStyleWord( true );
        textArea.setText(text);
        textArea.setSize(width, 1);
        textArea.setSize( textArea.getPreferredSize() );
        return textArea.getPreferredSize().height;
    }
}
