package com.chatgpt.api;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Chatgpt9515546 {
    public static String getStringAfterLastComma(String input) {
        Pattern p = Pattern.compile(".*,\\s*(.*)");
        Matcher m = p.matcher(input);

        if (m.find())
            return m.group(1);
        
        return null;
    }
}
