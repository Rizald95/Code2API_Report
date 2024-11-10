package com.chatgpt.api;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Chatgpt203992 {
    public static void removeRepeatedElements(ArrayList<String> list) {
        Set<String> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
    }
}
