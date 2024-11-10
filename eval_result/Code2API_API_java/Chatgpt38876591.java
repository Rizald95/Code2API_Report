package com.chatgpt.api;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Chatgpt38876591 {
    public static void addValueToList(List<Map<String, Object>> list, String key, Object value) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(key, value);
        list.add(map);
    }
}
