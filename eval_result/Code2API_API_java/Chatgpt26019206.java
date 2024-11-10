package com.chatgpt.api;
public class Chatgpt26019206 {
    public static String getFileNameFromPath(String filePath) {
        String lStr = filePath;
        lStr = lStr.substring(lStr.lastIndexOf("/")+1);
        return lStr;
    }
}
