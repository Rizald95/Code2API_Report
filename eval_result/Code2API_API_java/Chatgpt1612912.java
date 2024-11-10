package com.chatgpt.api;
import java.util.regex.Pattern;

public class Chatgpt1612912 {
    public static String removeCarriageReturn(String input) throws Exception {
        return input.replaceAll("[\n\r]", "");
    }
}
