package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;

public class Human5237354 {

  public static boolean isListOfStringsEmptyOrNullness(List<String> list) {
    System.out.println("blah = " + list); // displays "blah = []"
    if (list.isEmpty()) {
      System.out.println("Empty"); // doesn't get displayed
    }
    return list.isEmpty();
  }
}
