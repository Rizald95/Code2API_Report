package com.stackoverflow.api;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Human4499595 {

  public static void test(String fileName, String output) {
    try {
      FileWriter fstream = new FileWriter(fileName);
      BufferedWriter out = new BufferedWriter(fstream);
      out.write(output);
      out.close();
    } catch (Exception e) {
      System.err.println("Error: " + e.getMessage());
    }
  }
}
