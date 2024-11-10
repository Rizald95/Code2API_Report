package com.chatgpt.api;
import java.util.regex.Pattern;

public class Chatgpt5055036 {
    public static String replaceCaseInsensitive(String target, String search, String replacement) {
        target = target.replaceAll("(?i)" + Pattern.quote(search), replacement);
        return target;
    }
}
