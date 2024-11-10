package com.stackoverflow.api;

public class Human10008565 {

  public static String getOperatingSystem() {
    return (
      System.getProperty("os.name") +
      " " +
      System.getProperty("os.version") +
      " " +
      System.getProperty("os.arch")
    );
  }
}
