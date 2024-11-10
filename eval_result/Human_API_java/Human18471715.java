package com.stackoverflow.api;

public class Human18471715 {

  public static String addEscapeCharacters(String example) {
    //    String example = "Hello, I'm\" here";
    example = example.replaceAll("'", "\\\\'");
    example = example.replaceAll("\"", "\\\\\"");
    return example;
  }
}
