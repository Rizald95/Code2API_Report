package com.chatgpt.api;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Chatgpt4916023 {
    public static void matchPatternInText(String text, String pattern) {
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(text);

        while (matcher.find()) {
            System.out.printf("group: %s%n", matcher.group());
        }
        System.out.println("done");
    }
}
