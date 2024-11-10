package com.stackoverflow.api;

public class Human5387398 {

  public static void printMinutesInHHmm(int t) {
    int hours = t / 60; //since both are ints, you get an int
    int minutes = t % 60;
    System.out.printf("%d:%02d", hours, minutes);
  }
}
