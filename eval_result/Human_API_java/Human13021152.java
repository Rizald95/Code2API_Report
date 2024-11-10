package com.stackoverflow.api;

public class Human13021152 {

  public static int findNthFibonacciNumber(int n) {
    int num = 0;
    int num2 = 1;
    int loop;
    int fibonacci;
    System.out.print(num2);
    for (loop = 0; loop < n; loop++) {
      fibonacci = num + num2;
      num = num2;
      num2 = fibonacci;
    }
    System.out.print(num);
    return num;
  }
}
