package com.chatgpt.api;
public class Chatgpt27372799 {
    public static void parseNegativeNumber(String message) {
        String[] msg = message.split(",");
        int x = Integer.parseInt(msg[0]);
        int y = Integer.parseInt(msg[1]);
        System.out.println(x);
        System.out.println(y);
    }
}
