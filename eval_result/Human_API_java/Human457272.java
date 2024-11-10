package com.stackoverflow.api;

public class Human457272 {

  public static void clearSoftReference(Object temp) {
    temp = null;
    System.gc();
  }
}
