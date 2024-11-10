package com.chatgpt.api;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;

public class Chatgpt2228469 {
    public static void getPreferredSizeOfPanel() {
        JPanel lPanel = new JPanel();
        lPanel.setLayout(new BoxLayout(lPanel, BoxLayout.PAGE_AXIS));

        lPanel.add(new JLabel("Blah"));
        // etc...

        lPanel.setSize(lPanel.getPreferredSize());
        lPanel.doLayout();
    }
}
