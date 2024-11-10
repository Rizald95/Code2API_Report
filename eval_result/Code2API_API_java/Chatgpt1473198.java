package com.chatgpt.api;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Chatgpt1473198 {
    public static void getDataBetweenQuotes(String line) {
        Pattern p = Pattern.compile("\"([^\"]*)\"");
        Matcher m = p.matcher(line);
        while (m.find()) {
            System.out.println(m.group(1));
        }
    }
}
