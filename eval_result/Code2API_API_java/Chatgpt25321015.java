package com.chatgpt.api;
import java.io.IOException;

public class Chatgpt25321015 {
    public static void launchChromeBrowser() throws IOException, InterruptedException {
        try {
            Process p = Runtime.getRuntime().exec("\"/Program Files (x86)/Google/Chrome/Application/chrome.exe\"");
            p.waitFor();
            System.out.println("Google Chrome launched!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
