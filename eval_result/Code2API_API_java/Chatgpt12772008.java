package com.chatgpt.api;
public class Chatgpt12772008 {
    public static void printFibonacciSequence(int n) {
        int f = 0;
        int g = 1;

        for(int i = 1; i <= n; i++)
        {
            System.out.print(f + " ");
            f = f + g;
            g = f - g;
        } 

        System.out.println();
    }
}
