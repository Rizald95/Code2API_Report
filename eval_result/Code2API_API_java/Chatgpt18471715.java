package com.chatgpt.api;
public class Chatgpt18471715 {
    public static String addEscapeCharacters(String input) {
        input = input.replaceAll("'", "\\\\'");
        input = input.replaceAll("\"", "\\\\\"");
        return input;
    }
}
