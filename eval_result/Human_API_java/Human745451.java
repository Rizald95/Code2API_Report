package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

public class Human745451 {

  public static Date getDayBefore(Date myDate) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(myDate);
    cal.add(Calendar.DAY_OF_YEAR, -1);
    return cal.getTime();
  }
}
