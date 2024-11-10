package com.stackoverflow.api;

import java.util.Arrays;
import java.util.Comparator;

public class Human2529114 {

  public static String sortStringContainingNumbers(String string) {
    String[] numbers = string.split("\\D+");
    Arrays.sort(
      numbers,
      new Comparator<String>() {
        public int compare(String s1, String s2) {
          return Integer.valueOf(s1).compareTo(Integer.valueOf(s2));
        }
      }
    );
    return Arrays.toString(numbers);
  }
}
