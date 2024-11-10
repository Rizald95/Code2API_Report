package com.stackoverflow.api;

public class Human10990974 {

  public static String wrap(String str, int length) {
    String temp = "";
    if (str != null && str.length() > length) {
      temp = str.substring(0, length) + "....";
    } else {
      temp = str;
    }
    return temp;
  }
}
