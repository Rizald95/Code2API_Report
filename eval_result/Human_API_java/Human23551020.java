package com.stackoverflow.api;

public class Human23551020 {

  public static int breakWhileLoop() {
    int i = 0;
    while (i++ < 10) {
      if (i == 5) {
        break;
      }
    }
    //System.out.println(i); //prints 5
    return i;
  }
}
