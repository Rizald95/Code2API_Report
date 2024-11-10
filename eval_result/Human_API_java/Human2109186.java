package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

public class Human2109186 {

  public static Date getFirstDayOfWeek(int week, int year) {
    // Get calendar, clear it and set week number and year.
    Calendar calendar = Calendar.getInstance();
    calendar.clear();
    calendar.set(Calendar.WEEK_OF_YEAR, week);
    calendar.set(Calendar.YEAR, year);

    // Now get the first day of week.
    return calendar.getTime();
  }
}
