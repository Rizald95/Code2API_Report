package com.stackoverflow.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Human38876591 {

  public static void addValueToListMap(
    List<Map<String, Object>> list,
    String key,
    Object value
  ) {
    Map<String, Object> map = new HashMap<String, Object>();
    map.put(key, value);
    list.add(map);
  }
}
