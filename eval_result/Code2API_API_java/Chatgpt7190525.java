package com.chatgpt.api;
public class Chatgpt7190525 {
    public static void readStringBuilderLineByLine(StringBuilder sb) {
        String[] lines = sb.toString().split("\\n");
        for(String s: lines){
            System.out.println("Content = " + s);
            System.out.println("Length = " + s.length());
        }
    }
}
