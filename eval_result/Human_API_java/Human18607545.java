package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Human18607545 {

  public static void printStringsFromFile(String str1) {
    BufferedReader in = null;
    try {
      in = new BufferedReader(new FileReader(str1));
      String read = null;
      while ((read = in.readLine()) != null) {
        String[] splited = read.split("\\s+");
        for (String part : splited) {
          System.out.println(part);
        }
      }
    } catch (IOException e) {
      System.out.println("There was a problem: " + e);
      e.printStackTrace();
    } finally {
      try {
        in.close();
      } catch (Exception e) {}
    }
  }
}
