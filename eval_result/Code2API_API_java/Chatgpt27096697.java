package com.chatgpt.api;
public class Chatgpt27096697 {
    public static void sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
