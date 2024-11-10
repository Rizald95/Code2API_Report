package com.stackoverflow.api;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Human19279560 {

  public static void usageOfComputeIfAbsent() {
    Map<String, Boolean> whoLetDogsOut = new ConcurrentHashMap<>();
    whoLetDogsOut.computeIfAbsent("snoop", k -> f(k));
    whoLetDogsOut.computeIfAbsent("snoop", k -> f(k));
  }

  static boolean f(String s) {
    System.out.println("creating a value for \"" + s + '"');
    return s.isEmpty();
  }
}
