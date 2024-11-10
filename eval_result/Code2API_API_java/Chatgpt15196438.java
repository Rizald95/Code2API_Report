package com.chatgpt.api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chatgpt15196438 {
    public static int[] createRandomIntArray(int size, int range) {
        List<Integer> dataList = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            dataList.add(i);
        }
        Collections.shuffle(dataList);
        int[] num = new int[dataList.size()];
        for (int i = 0; i < dataList.size(); i++) {
            num[i] = dataList.get(i);
        }
        return num;
    }
}
