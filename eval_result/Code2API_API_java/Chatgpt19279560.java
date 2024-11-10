package com.chatgpt.api;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Chatgpt19279560 {
    public static void useComputeIfAbsent(Map<String, Boolean> map, String key) {
        map.computeIfAbsent(key, k -> f(k));
    }
    
    static boolean f(String s) {
        System.out.println("creating a value for \""+s+'"');
        return s.isEmpty();
    }
}
