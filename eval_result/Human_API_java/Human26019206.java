package com.stackoverflow.api;

public class Human26019206 {

  public static String getFileNameFromPath(String lStr) {
    lStr = lStr.substring((lStr.lastIndexOf("/")));
    return lStr;
  }
}
