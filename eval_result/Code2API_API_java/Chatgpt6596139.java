package com.chatgpt.api;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Chatgpt6596139 {
    public static String checkAlphanumericCharacters(String input) {
        Pattern p = Pattern.compile("[a-zA-Z0-9]");
        Matcher m = p.matcher(input);
        if (m.find())
            return "The string \"" + input + "\" contains alphanumerical characters.";
        else
            return "The string \"" + input + "\" does not contain alphanumerical characters.";
    }
}
