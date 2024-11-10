package com.stackoverflow.api;

public class Human25321015 {

  public static void launchBrowser(String executablePath) {
    try {
      Process p = Runtime.getRuntime().exec(executablePath);
      p.waitFor();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
