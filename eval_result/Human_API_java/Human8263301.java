package com.stackoverflow.api;

import java.util.Calendar;
import java.util.TimeZone;

public class Human8263301 {

  public static long secondsSinceEpoch(
    String timeZone,
    int year,
    int month,
    int date
  ) {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
    calendar.clear();
    calendar.set(year, month, date);
    return calendar.getTimeInMillis() / 1000L;
  }
}
