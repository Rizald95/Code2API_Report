package com.chatgpt.api;
public class Chatgpt8646467 {
    public static String[] getTextBeforeAndAfterDash(String input) {
        String[] parts = input.split("-");
        String first = parts[0];
        String second = parts[1];
        return new String[]{first, second};
    }
}
