package com.stackoverflow.api;

public class Human40910835 {

  public static String removeAllCharactersBefore(String s, char c) {
    String s1 = s.substring(s.indexOf(c) + 1);
    return s1.trim();
  }
}
