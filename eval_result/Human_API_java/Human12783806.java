package com.stackoverflow.api;

import java.util.Calendar;

public class Human12783806 {

  public static int getLastSunday() {
    Calendar cal = Calendar.getInstance();
    cal.add(Calendar.DAY_OF_WEEK, -(cal.get(Calendar.DAY_OF_WEEK) - 1));
    return cal.get(Calendar.DATE);
  }
}
