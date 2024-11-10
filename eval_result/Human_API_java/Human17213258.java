package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

public class Human17213258 {

  public static boolean isTimeBetweenTwoHours(int from, int to) {
    Date date = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(date);
    int t = c.get(Calendar.HOUR_OF_DAY) * 100 + c.get(Calendar.MINUTE);
    return (
      to > from && t >= from && t <= to || to < from && (t >= from || t <= to)
    );
  }
}
