package com.stackoverflow.api;

public class Human7506812 {

  public static String padStringRight(int lengthAfterPadding) {
    return String.format("[%-" + lengthAfterPadding + "s]", "foo");
  }
}
