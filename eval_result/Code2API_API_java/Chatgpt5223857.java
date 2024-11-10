package com.chatgpt.api;
public class Chatgpt5223857 {
    public static void countOccurrences(String input, String sequence) {
        int index = input.indexOf(sequence);
        int count = 0;
        while (index != -1) {
            count++;
            input = input.substring(index + 1);
            index = input.indexOf(sequence);
        }
        System.out.println("No of " + sequence + " in the input is : " + count);
    }
}
