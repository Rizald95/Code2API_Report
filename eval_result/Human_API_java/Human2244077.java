package com.stackoverflow.api;

public class Human2244077 {

  public static int executeExecCommand(String s) {
    String[] cmd = { s };
    Process p = Runtime.getRuntime().exec(cmd);
    p.waitFor();
  }
}
