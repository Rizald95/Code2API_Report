package com.stackoverflow.api;

public class Human1612912 {

  public static String removeCarriageReturn(String s1) {
    String s2 = s1.replaceAll("[\n\r]", "");
    return s2;
  }
}
