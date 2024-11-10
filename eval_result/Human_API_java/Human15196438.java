package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human15196438 {

  public static int[] shuffleNumbers(int begin, int end) {
    List<Integer> dataList = new ArrayList<Integer>();
    for (int i = begin; i < end; i++) {
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
