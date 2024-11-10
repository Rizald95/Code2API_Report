package com.stackoverflow.api;

public class Human2800839 {

  public static String removePrefixedZerosFromString(final String s) {
    return s.replaceFirst("^0+(?!$)", "");
  }
}
