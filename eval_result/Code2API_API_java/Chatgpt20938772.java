package com.chatgpt.api;
public class Chatgpt20938772 {
    public static String doubleChar(String str) {
        String str1 = "";
        for(int i=0;i<str.length();i++)
        {
            str1 += String.valueOf(str.charAt(i)) + str.charAt(i);
        }
        return str1;
    }
}
