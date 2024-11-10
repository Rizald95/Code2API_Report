package com.stackoverflow.api;

import java.util.Calendar;

public class Human12899896 {

  public static Calendar getTheSameDayInAMonth(int year, int month, int day) {
    final Calendar date = Calendar.getInstance();
    date.set(year, month, day);

    int prevDayOfWeekInMonth = date.get(Calendar.DAY_OF_WEEK_IN_MONTH);
    int prevDayOfWeek = date.get(Calendar.DAY_OF_WEEK);

    date.add(Calendar.MONTH, 1);
    date.set(Calendar.DAY_OF_WEEK, prevDayOfWeek);
    date.set(Calendar.DAY_OF_WEEK_IN_MONTH, prevDayOfWeekInMonth);
    return date;
  }
}
