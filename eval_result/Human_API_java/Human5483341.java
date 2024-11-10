package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Human5483341 {

  public static List<String> toList(HashMap<Integer, String> map) {
    List<String> list = new ArrayList<String>(map.values());
    for (String s : list) {
      System.out.println(s);
    }

    return list;
  }
}
