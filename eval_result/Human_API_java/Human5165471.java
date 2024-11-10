package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

public class Human5165471 {

  public static Date dateFromTime(
    int hour,
    int minute,
    int second,
    int millisecond
  ) {
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.HOUR_OF_DAY, hour);
    cal.set(Calendar.MINUTE, minute);
    cal.set(Calendar.SECOND, second);
    cal.set(Calendar.MILLISECOND, millisecond);
    return cal.getTime();
  }
}
