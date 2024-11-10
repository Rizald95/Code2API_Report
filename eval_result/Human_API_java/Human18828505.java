package com.stackoverflow.api;

public class Human18828505 {

  public static int getMax(int[] convertedValues) {
    int max = convertedValues[0];

    for (int i = 1; i < convertedValues.length; i++) {
      if (convertedValues[i] > max) {
        max = convertedValues[i];
      }
    }
    return max;
  }
}
