package com.stackoverflow.api;

import java.util.Map;

public class Human7427797 {

  public static void useSortedMap(Map<Integer, String> map) {
    // Iterate over them
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " => " + entry.getValue());
    }
  }
}
