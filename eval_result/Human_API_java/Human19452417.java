package com.stackoverflow.api;

public class Human19452417 {

  public static String applyFilterCriteria(String value) {
    final String ESC = "\\$1";
    final String NON_ALPHA = "([^A-Za-z0-9@])";
    final String WILD = "*";
    final String WILD_RE_TEMP = "@";
    final String WILD_RE = ".*";
    value = value.replace(WILD, WILD_RE_TEMP);
    value = value.replaceAll(NON_ALPHA, ESC);
    value = value.replace(WILD_RE_TEMP, WILD_RE);
    value = value.replace("*", ".*"); // replace  * with .*
    return value;
  }
}
