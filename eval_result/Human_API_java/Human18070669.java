package com.stackoverflow.api;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Human18070669 {

  public static void writeToFile(String str1) {
    System.out.print("Enter Text: ");
    Scanner scan = new Scanner(System.in);
    String text = scan.nextLine();
    FileWriter fWriter = null;
    BufferedWriter writer = null;
    try {
      fWriter = new FileWriter(str1);
      writer = new BufferedWriter(fWriter);
      writer.write(text);
      writer.newLine();
      writer.close();
      System.err.println(
        "Your input of " + text.length() + " characters was saved."
      );
    } catch (Exception e) {
      System.out.println("Error!");
    }
  }
}
