package com.stackoverflow.api;

import java.util.HashMap;
import java.util.Map;

public class Human4120268 {

  public static Map<String, Object> createMapOfMaps() {
    Map<Object, String> mp = new HashMap<>();

    // adding or set elements in Map by put method key and value pair
    mp.put(2, "Two");
    mp.put(1, "One");
    mp.put(3, "Three");
    mp.put(4, "Four");

    Map<Object, String> mp2 = new HashMap<>();
    mp2.put(2, "Two2");
    mp2.put(1, "One2");
    mp2.put(3, "Three2");
    mp2.put(4, "Four2");

    Map<String, Object> mpMaps = new HashMap<>();

    mpMaps.put("Map1", mp);
    mpMaps.put("Map2", mp2);

    return mpMaps;
  }
}
