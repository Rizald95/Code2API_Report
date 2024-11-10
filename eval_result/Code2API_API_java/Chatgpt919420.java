package com.chatgpt.api;
import java.util.ArrayList;
import java.util.Collection;

public class Chatgpt919420 {
    public static ArrayList<String> getDifferenceBetweenLists(ArrayList<String> listA, ArrayList<String> listB) {
        listB.removeAll(listA);
        return listB;
    }
}
