package com.stackoverflow.api;

public class Human24753336 {

  public static int[] getDecimalSplitByDot(double val) {
    String[] arr = String.valueOf(val).split("\\.");
    int[] intArr = new int[2];
    intArr[0] = Integer.parseInt(arr[0]); // 1
    intArr[1] = Integer.parseInt(arr[1]); // 9
    return intArr;
  }
}
