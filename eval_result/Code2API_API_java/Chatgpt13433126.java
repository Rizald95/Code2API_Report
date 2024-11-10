package com.chatgpt.api;
public class Chatgpt13433126 {
    public static void countCharacterOccurrences(String sentence, char character) {
        int cnt = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == character) {
                cnt++;
            }
        }
        System.out.println("No of Occurences of character " + character + " is " + cnt);
    }
}
