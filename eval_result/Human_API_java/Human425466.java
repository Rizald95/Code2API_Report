package com.stackoverflow.api;

public class Human425466 {

  public static void checkIfElementIsNull(Object[][] someArray) {
    for (int i = 0; i <= someArray.length - 1; i++) {
      if (someArray[i] != null) {
        System.out.println("not null");
      } else {
        System.out.println("null");
      }
    }
  }
}
