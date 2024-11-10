package com.chatgpt.api;
public class Chatgpt10990974 {
    public static void wrapString(String str, int length) {
        String temp = "";
        if(str !=null && str.length() > length) {
            temp = str.substring(0, length) + "...."; // here 0 is start index and length is last index
        } else {
            temp = str;
        }
        System.out.println(temp);
    }
}
