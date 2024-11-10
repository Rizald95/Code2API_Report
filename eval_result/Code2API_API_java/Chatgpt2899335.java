package com.chatgpt.api;
public class Chatgpt2899335 {
    public static String getNextAndPreviousLetters(String letter) {
        String next = String.valueOf((char) (letter.charAt(0) + 1));
        String previous = String.valueOf((char) (letter.charAt(0) - 1));
        return next + " " + previous;
    }
}
