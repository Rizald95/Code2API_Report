package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

public class Human1711820 {

  public static int getHourOfDay() {
    Date date = new Date();
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    return calendar.get(Calendar.HOUR_OF_DAY);
  }
}
