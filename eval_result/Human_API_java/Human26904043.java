package com.stackoverflow.api;

import java.util.HashMap;
import java.util.Map;

public class Human26904043 {

  public static Map checkHashMaps(
    Map<String, String> hm1,
    Map<String, String> hm2
  ) {
    final Map<String, String> hm3 = new HashMap<>();

    for (final String key : hm1.keySet()) {
      if (hm2.containsKey(key)) {
        hm3.put(hm1.get(key), hm2.get(key));
      }
    }
    return hm3;
  }
}
