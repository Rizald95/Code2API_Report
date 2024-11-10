package com.chatgpt.api;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Chatgpt4078601 {
    public static void modifyMapValues(Map<String, String> map) {
        Map.Entry<String, String> entry;
        Iterator<Map.Entry<String, String>> it;

        // Iterate through the entries, changing one of them
        it = map.entrySet().iterator();
        while (it.hasNext()) {
            entry = it.next();
            System.out.println("Visiting " + entry.getKey());
            if (entry.getKey().equals("two")) {
                System.out.println("Modifying it");
                entry.setValue("DUE");
            }
        }

        // Show the result
        it = map.entrySet().iterator();
        while (it.hasNext()) {
            entry = it.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
