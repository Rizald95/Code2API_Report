package com.chatgpt.api;
import java.util.ArrayList;
import java.util.List;

public class Chatgpt5237354 {
    public static void testListForEmptyOrNullness(List<String> list) {
        list.add("");

        System.out.println("blah = " + list);
        if (list.isEmpty()) {
            System.out.println("Empty");
        }
    }
}
