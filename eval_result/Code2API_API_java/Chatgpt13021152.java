package com.chatgpt.api;
public class Chatgpt13021152 {
    public static int findNthFibonacciNumber(int n) {
        int num = 0;
        int num2 = 1;
        int loop;
        int fibonacci;
        for (loop = 0; loop < n; loop ++) {
            fibonacci = num + num2;
            num = num2;
            num2 = fibonacci;
        }
        return num;
    }
}
