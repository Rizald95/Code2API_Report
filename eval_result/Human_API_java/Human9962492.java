package com.stackoverflow.api;

public class Human9962492 {

  public static void printPlaces(double[] values) {
    for (int i = 0; i < values.length; i++) {
      double tenthPower = Math.floor(Math.log10(values[i]));
      double place = Math.pow(10, tenthPower);
      System.out.println(place);
    }
  }
}
