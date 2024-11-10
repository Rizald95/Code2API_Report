package com.stackoverflow.api;

public class Human33261057 {

  public static String escapeDoubleQuotes(String text) {
    text = text.replaceAll("\\\"", "\"").replaceAll("\"\"", "\"");
    return text;
  }
}
