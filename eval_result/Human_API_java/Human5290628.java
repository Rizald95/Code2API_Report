package com.stackoverflow.api;

public class Human5290628 {

  public static int extractFirstFourIntsFromString(String str) {
    int fullInt = Integer.parseInt(str);
    String first4char = str.substring(0, 4);
    return Integer.parseInt(first4char);
  }
}
