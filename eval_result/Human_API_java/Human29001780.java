package com.stackoverflow.api;

public class Human29001780 {

  public static void sortInput() {
    String input = args[0];

    String[] tokens = input.split(",");

    for (int i = 0; i < tokens.length; i++) {
      for (int j = i + 1; j < tokens.length; j++) {
        String left = tokens[i];
        String right = tokens[j];
        if (isNumber(left) && isNumber(right)) {
          int lNum = Integer.valueOf(left);
          int rNum = Integer.valueOf(right);
          if (lNum < rNum) {
            swap(tokens, i, j);
          }
        }
      }
    }
  }

  private static boolean isNumber(String s) {
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException nfe) {
      return false;
    }
  }

  private static void swap(String[] arr, int i, int j) {
    String tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }
}
