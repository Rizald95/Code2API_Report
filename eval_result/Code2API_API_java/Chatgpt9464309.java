package com.chatgpt.api;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Chatgpt9464309 {
    public static String findExactWord(String input, String word) {
        Pattern p = Pattern.compile("\\b" + word + "\\b");
        Matcher m = p.matcher(input);
        m.find();
        return m.group();
    }
}
