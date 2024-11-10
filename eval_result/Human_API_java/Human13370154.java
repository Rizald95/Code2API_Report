package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Human13370154 {

  public static void convertToArrayOfCharsAndPrint(String str1)
    throws IOException {
    Scanner s = null;
    try {
      s = new Scanner(new BufferedReader(new FileReader(str1)));
      while (s.hasNext()) {
        String str = s.next();
        char[] myChar = str.toCharArray();
        // do something
      }
    } finally {
      if (s != null) {
        s.close();
      }
    }
  }
}
