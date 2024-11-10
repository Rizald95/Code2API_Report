package com.chatgpt.api;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Chatgpt28728429 {
    public static void splitPattern(String patternString) {
        Pattern pattern = Pattern.compile("y+|M+|d+");
        Matcher matcher = pattern.matcher(patternString);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
