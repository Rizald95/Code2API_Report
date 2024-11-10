package com.stackoverflow.api;

public class Human13433126 {

  public static int countCharOccurrences(String s, char c) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == c) count++;
    }
    return count;
  }
}
