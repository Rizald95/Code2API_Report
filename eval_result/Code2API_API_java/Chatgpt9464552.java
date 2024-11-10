package com.chatgpt.api;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Chatgpt9464552 {
    public static String extractPhoneNumber(String inputString) {
        Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
        Matcher matcher = pattern.matcher(inputString);
        if (matcher.find()) {
            return matcher.group(0);
        }
        return null;
    }
}
