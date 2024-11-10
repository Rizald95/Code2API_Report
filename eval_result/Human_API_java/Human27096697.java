package com.stackoverflow.api;

public class Human27096697 {

  public static int sumDigits(int num) {
    int sum = 0;
    while (num > 0) {
      sum = sum + num % 10;
      num = num / 10;
    }
    return sum;
  }
}
