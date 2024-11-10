package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

public class Human1655450 {

  public static Date getCalendarTime() {
    Calendar calendar = Calendar.getInstance(); // gets a calendar using the default time zone and locale.
    calendar.add(Calendar.SECOND, 5);
    return calendar.getTime();
  }
}
