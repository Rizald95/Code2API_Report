package com.chatgpt.api;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Chatgpt2961537 {
    public static String getSecondWord(String input) {
        Pattern pattern = Pattern.compile("\\s([A-Za-z]+)");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
}
