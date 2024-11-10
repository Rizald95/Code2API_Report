package com.chatgpt.api;
public class Chatgpt40910835 {
    public static String removeCharactersBefore(String input) {
        String s1 = input.substring(input.indexOf("=") + 1);
        s1.trim();
        return s1;
    }
}
