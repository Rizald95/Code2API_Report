package com.stackoverflow.api;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Human2297629 {

  public static StringBuilder readMultipleLongs() {
    StringBuilder lines = new StringBuilder();
    Scanner stdin = new Scanner(new BufferedInputStream(System.in));
    while (stdin.hasNext()) {
      lines.append(Math.abs(stdin.nextLong() - stdin.nextLong()));
    }
    return lines;
  }
}
