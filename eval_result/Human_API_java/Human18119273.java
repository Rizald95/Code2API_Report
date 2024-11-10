package com.stackoverflow.api;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Human18119273 {

  public static boolean userInputNotInt() {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.println("Please input an integer");
      // nextInt will throw InputMismatchException
      // if the next token does not match the Integer
      // regular expression, or is out of range
      sc.nextInt();
    } catch (InputMismatchException exception) {
      // Print "This is not an integer"
      // when user put other than integer
      System.out.println("This is not an integer");
      sc.close();
      return true;
    }
    sc.close();
    return false;
  }
}
