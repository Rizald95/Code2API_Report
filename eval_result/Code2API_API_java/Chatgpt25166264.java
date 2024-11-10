package com.chatgpt.api;
public class Chatgpt25166264 {
    public static void addDelayToWhileLoop() throws InterruptedException {
        int countdown = 1;
        while (countdown < 10){
            System.out.println(countdown);
            ++countdown;
            Thread.sleep(1000);
        }
    }
}
