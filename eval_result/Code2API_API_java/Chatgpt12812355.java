package com.chatgpt.api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chatgpt12812355 {
    public static String[] removeValueFromArray(String[] strArray, String valueToRemove) {
        List<String> list = new ArrayList<String>(Arrays.asList(strArray));
        list.remove(valueToRemove);
        return list.toArray(new String[0]);
    }
}
