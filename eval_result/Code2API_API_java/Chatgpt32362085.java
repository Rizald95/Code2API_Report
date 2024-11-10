package com.chatgpt.api;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Chatgpt32362085 {
    public static String isTimeInString(String string) {
        System.out.println(String.format("Is there a time in here:(%1$s)", string));
        Pattern p = Pattern.compile(".*([01]?[0-9]|2[0-3]):[0-5][0-9].*");
        Matcher m = p.matcher(string);
        if(m.matches()){
            return "Yes";
        }else{
            return "No.";
        }
    }
}
