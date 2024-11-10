package com.stackoverflow.api;

public class Human35499670 {

  public static void compareStrings(String first, String second) {
    String n = first;
    String n2 = second;
    if (n.compareTo(n2) < 0) {
      System.out.println(n + " is before than " + n2);
    } else if (n.compareTo(n2) > 0) {
      System.out.println(n + " is after than " + n2);
    } else if (n.compareTo(n2) == 0) {
      System.out.println(n + " is equals to " + n);
    }
  }
}
