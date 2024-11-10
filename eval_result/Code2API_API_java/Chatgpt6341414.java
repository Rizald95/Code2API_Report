package com.chatgpt.api;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Chatgpt6341414 {
    public static boolean isRegularExpression(String input) {
        boolean isRegex;
        try {
            Pattern.compile(input);
            isRegex = true;
        } catch (PatternSyntaxException e) {
            isRegex = false;
        }
        return isRegex;
    }
}
