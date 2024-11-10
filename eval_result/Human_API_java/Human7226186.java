package com.stackoverflow.api;

import java.util.Calendar;

public class Human7226186 {

  public static String getDayOfMonthAsString() {
    Calendar cal = Calendar.getInstance();
    int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);

    return String.valueOf(dayOfMonth);
  }
}
