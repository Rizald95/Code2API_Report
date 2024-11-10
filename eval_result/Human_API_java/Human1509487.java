package com.stackoverflow.api;

import java.util.TreeMap;

public class Human1509487 {

  public static String methodName(TreeMap<String, String> myMap) {
    String first = myMap.firstEntry().getValue();
    return myMap.get(myMap.firstKey());
  }
}
