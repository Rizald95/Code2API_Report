package com.stackoverflow.api;

public class Human36110491 {

  public static String getNameFromLine(String line) {
    String[] parts = line.split(" ");

    String name = parts[1];
    //System.out.println(name);
    return name;
  }
}
