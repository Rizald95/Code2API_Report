package com.chatgpt.api;
public class Chatgpt33261057 {
    public static String replaceDoubleQuotes(String text) {
        text = text.replaceAll("\\\"","\"").replaceAll("\"\"", "\"");
        return text;
    }
}
