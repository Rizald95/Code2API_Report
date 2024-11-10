package com.chatgpt.api;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Chatgpt16516670 {
    public static List<Map<String, List<String>>> storeHashMapInList() {
        List<Map<String, List<String>>> list = new ArrayList<Map<String, List<String>>>();
        Map<String, List<String>> map1 = new HashMap<String, List<String>>();
        List<String> arraylist1 = new ArrayList<String>();
        arraylist1.add("Text1");
        map1.put("key1", arraylist1);
        list.add(map1);
        return list;
    }
}
