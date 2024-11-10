package com.stackoverflow.api;

public class Human4065546 {

  public static String getMethodNameFromStackTrace(int num) {
    StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
    StackTraceElement e = stacktrace[num];
    return e.getMethodName();
  }
}
