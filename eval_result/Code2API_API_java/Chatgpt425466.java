package com.chatgpt.api;
public class Chatgpt425466 {
    public static void checkForNullElements(Object[][] someArray) {
        for (int i=0; i<=someArray.length-1; i++) {
            if (someArray[i] != null) {
                System.out.println("not null");
            } else {
                System.out.println("null");
            }
        }
    }
}
