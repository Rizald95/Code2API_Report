package com.stackoverflow.api;

import java.util.HashMap;

public class Human6712708 {

  public static HashMap countFrequencyOfCharacters() {
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    String s = "aasjjikkk";
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      Integer val = map.get(c);
      if (val != null) {
        map.put(c, new Integer(val + 1));
      } else {
        map.put(c, 1);
      }
    }
    return map;
  }
}
