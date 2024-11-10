package com.stackoverflow.api;

import java.util.HashMap;
import java.util.Map;

public class Human19336268 {

  public static void createMap() {
    Map<String, String> details = new HashMap<>();
    for (int i = 1; i < 101; i++) {
      if (i < 60) {
        details.put("person" + i, "female");
      } else {
        details.put("person" + i, "male");
      }
    }
  }
}
