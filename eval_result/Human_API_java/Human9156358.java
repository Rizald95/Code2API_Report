package com.stackoverflow.api;

public class Human9156358 {

  public static void printLocalTime(String timezone) {
    java.util.TimeZone tz = java.util.TimeZone.getTimeZone(timezone);
    java.util.Calendar c = java.util.Calendar.getInstance(tz);

    System.out.println(
      c.get(java.util.Calendar.HOUR_OF_DAY) +
      ":" +
      c.get(java.util.Calendar.MINUTE) +
      ":" +
      c.get(java.util.Calendar.SECOND)
    );
  }
}
