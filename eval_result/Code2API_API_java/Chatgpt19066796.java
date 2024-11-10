package com.chatgpt.api;
public class Chatgpt19066796 {
    public static void findVowelsInString(String str) {
        for(int i=0;i <str.length();i++){
            if((str.charAt(i) == 'a') || 
                (str.charAt(i) == 'e')  ||
                (str.charAt(i) == 'i') || 
                (str.charAt(i) == 'o') ||
                (str.charAt(i) == 'u')) {
                System.out.println(" The String contains " + str.charAt(i));
            }
        }
    }
}
