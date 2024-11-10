package com.stackoverflow.api;

import java.io.IOException;

public class Human21438476 {

  public static void processStandardInput() throws IOException {
    int ch;
    while ((ch = System.in.read()) != -1) {
      if (ch != '\n' && ch != '\r') {
        processChar((char) ch);
      }
    }
  }

  private static void processChar(char c) {
    // do stuff
    System.out.println("Processing: '" + c + "'");
  }
}
