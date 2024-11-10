package com.chatgpt.api;
public class Chatgpt2244077 {
    public static void executeCommand(String[] cmd) throws Exception {
        Process p = Runtime.getRuntime().exec(cmd);
        p.waitFor();
    }
}
