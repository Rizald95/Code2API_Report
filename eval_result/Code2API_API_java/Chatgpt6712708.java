package com.chatgpt.api;
import java.util.HashMap;
import java.util.Map;

public class Chatgpt6712708 {
    public static Map<Character, Integer> countCharacterFrequency(String input) throws NullPointerException {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            Integer val = map.get(c);
            if (val != null) {
                map.put(c, val + 1);
            }
            else {
                map.put(c, 1);
            }
        }
        return map;
    }
}
