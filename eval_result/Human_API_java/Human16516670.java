package com.stackoverflow.api;

import java.util.List;
import java.util.Map;

public class Human16516670 {

  public static List<Map<String, List<String>>> storeInList(
    Map<String, List<String>> map1,
    List<Map<String, List<String>>> list
  ) {
    list.add(map1); // In this way you can add.

    return list;
  }
}
