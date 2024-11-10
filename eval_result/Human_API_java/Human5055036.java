package com.stackoverflow.api;

public class Human5055036 {

  public static void replace(
    String target,
    String pattern,
    String replacement
  ) {
    target = target.replaceAll("(?i)" + pattern, replacement);
    System.out.println(target);
  }
}
