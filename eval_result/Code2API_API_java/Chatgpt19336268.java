package com.chatgpt.api;
import java.util.HashMap;
import java.util.Map;

public class Chatgpt19336268 {
    public static Map<String, String> createVariablesDynamically() {
        Map<String, String> details = new HashMap<>();
        for (int i = 1; i <101; i++) {
            if (i<60) {
                details.put("person" + i, "female");
            }
            else {
                details.put("person" + i, "male");
            }
        }
        return details;
    }
}
