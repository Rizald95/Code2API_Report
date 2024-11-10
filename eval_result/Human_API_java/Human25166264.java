package com.stackoverflow.api;

public class Human25166264 {

  public static void delayedWhileLoop(int delay) throws InterruptedException {
    int countdown = 1;
    while (countdown < 10) {
      System.out.println(countdown);
      ++countdown;
      Thread.sleep(delay);
    }
  }
}
