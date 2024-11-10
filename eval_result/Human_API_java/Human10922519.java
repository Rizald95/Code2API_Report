package com.stackoverflow.api;

public class Human10922519 {

  public static int[] arrayInSwitchCase(int something) {
    int[] array;
    switch (something) {
      case 0:
        array = new int[] { 1, 2, 3 };
        break;
      default:
        array = new int[] { 3, 2, 1 };
    }
    return array;
  }
}
