package com.chatgpt.api;
import java.util.HashMap;
import java.util.Map;

public class Chatgpt26904043 {
    public static Map<String, String> compareHashMaps(Map<String, String> hashMap1, Map<String, String> hashMap2) {
        Map<String, String> hashMap3 = new HashMap<>();

        for (String key : hashMap1.keySet()) {
            if (hashMap2.containsKey(key)) {
                hashMap3.put(hashMap1.get(key), hashMap2.get(key));
            }
        }

        return hashMap3;
    }
}
