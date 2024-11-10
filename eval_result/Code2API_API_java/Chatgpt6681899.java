package com.chatgpt.api;
import java.util.ArrayList;
import java.util.Arrays;

public class Chatgpt6681899 {
    public static String[] removeElementFromArray(String[] array, int index) {
        java.util.List<String> list = new ArrayList<String>(Arrays.asList(array));
        list.remove(index);
        String[] new_array = list.toArray(new String[0]);
        return new_array;
    }
}
