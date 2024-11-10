package com.stackoverflow.api;

import java.util.HashMap;
import java.util.HashSet;

public class Human21625811 {

  public static HashSet<String> removeDuplicateValues(
    HashMap<Integer, String> hm
  ) {
    HashSet<String> hm2 = new HashSet<String>();
    hm2.addAll(hm.values());

    return hm2;
  }
}
