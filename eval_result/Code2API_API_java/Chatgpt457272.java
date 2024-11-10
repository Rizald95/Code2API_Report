package com.chatgpt.api;
public class Chatgpt457272 {
    public static void clearSoftReferences() {
        Object temp = new Object();
        temp = null;
        System.gc();
    }
}
