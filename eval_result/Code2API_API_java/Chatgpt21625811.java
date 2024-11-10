package com.chatgpt.api;
import java.util.HashMap;
import java.util.HashSet;

public class Chatgpt21625811 {
    public static void removeDuplicateValues(HashMap<Integer, String> hm) {
        HashSet<String> hm2 = new HashSet<String>();
        hm2.addAll(hm.values());

        for (String str : hm2){
            System.out.println(str);
        }
    }
}
