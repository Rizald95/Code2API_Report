package com.chatgpt.api;
public class Chatgpt8871710 {
    public static String[] findSubStrings(String originalString, String subString) {
        String[] split = originalString.split(subString);
        String firstSubString = split[0];
        String secondSubString = split[1];
        return new String[]{firstSubString, secondSubString};
    }
}
