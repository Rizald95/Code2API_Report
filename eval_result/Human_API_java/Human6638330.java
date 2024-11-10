package com.stackoverflow.api;

public class Human6638330 {

  public static void breakMainLoop(int pPoints, int goal) {
    mainLoop:while (goal <= 100) {
      for (int i = 0; i < goal; i++) {
        if (pPoints > 50) {
          break mainLoop;
        }
        pPoints += i;
      }
    }
  }
}
