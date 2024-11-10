package com.stackoverflow.api;

import java.util.Iterator;
import java.util.Map;

public class Human4078601 {

  public static Map<String, String> mapModify(
    Map<String, String> map,
    String key,
    String value
  ) {
    Map.Entry<String, String> entry;
    Iterator<Map.Entry<String, String>> it;
    // Iterate through the entries, changing one of them
    it = map.entrySet().iterator();
    while (it.hasNext()) {
      entry = it.next();
      System.out.println("Visiting " + entry.getKey());
      if (entry.getKey().equals(key)) {
        System.out.println("Modifying it");
        entry.setValue(value);
      }
    }
    return map;
  }
}
