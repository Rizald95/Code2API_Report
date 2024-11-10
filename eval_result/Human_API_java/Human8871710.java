package com.stackoverflow.api;

public class Human8871710 {

  public static String[] findPreAndSucOfSubString(String s, String sub) {
    String[] split = s.split(sub);
    String firstSubString = split[0];
    String secondSubString = split[1];
    String[] result = new String[2];
    result[0] = firstSubString;
    result[1] = secondSubString;
    return result;
  }
}
