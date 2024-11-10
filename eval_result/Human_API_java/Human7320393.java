package com.stackoverflow.api;

import java.util.Arrays;
import java.util.Scanner;

public class Human7320393 {

  public static void inputTillBlankLine() {
    Scanner keyboard = new Scanner(System.in);
    String line = null;
    while (!(line = keyboard.nextLine()).isEmpty()) {
      String[] values = line.split("\\s+");
      System.out.print("entered: " + Arrays.toString(values) + "\n");
    }
    System.out.print("Bye!");
  }
}
