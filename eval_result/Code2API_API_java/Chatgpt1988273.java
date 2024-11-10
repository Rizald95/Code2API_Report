package com.chatgpt.api;
import javax.swing.*;

public class Chatgpt1988273 {
    public static void openWebPageInFrame(String url) throws Exception {
        JEditorPane website = new JEditorPane(url);
        website.setEditable(false);

        JFrame frame = new JFrame("Web Page");
        frame.add(new JScrollPane(website));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
    }
}
