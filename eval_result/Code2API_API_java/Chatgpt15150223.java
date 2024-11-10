package com.chatgpt.api;
public class Chatgpt15150223 {
    public static void checkStringForIncorrectCharacters(String input) {
        if(!input.matches("[abc]+")) {
            System.out.println("The string you entered has some incorrect characters");
        }
    }
}
