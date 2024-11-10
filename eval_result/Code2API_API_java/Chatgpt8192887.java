package com.chatgpt.api;
import java.util.ArrayList;
import java.util.List;

public class Chatgpt8192887 {
    public static List<String> searchStringInArrayList(List<String> list, String searchString) {
        List<String> listClone = new ArrayList<String>(); 
        for (String string : list) {
            if(string.matches("(?i)(" + searchString + ").*")){
                listClone.add(string);
            }
        }
        return listClone;
    }
}
