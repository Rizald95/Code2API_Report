package com.chatgpt.api;
public class Chatgpt5290628 {
    public static int getFirstFourDigits(String str) {
        String first4char = str.substring(0,4);
        int intForFirst4Char = Integer.parseInt(first4char);
        return intForFirst4Char;
    }
}
