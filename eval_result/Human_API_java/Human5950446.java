package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

public class Human5950446 {

  public static Date incrementTimeByOneHour(Date previous_time) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(previous_time);
    calendar.add(Calendar.HOUR, 1);
    previous_time = calendar.getTime();
    return previous_time;
  }
}
