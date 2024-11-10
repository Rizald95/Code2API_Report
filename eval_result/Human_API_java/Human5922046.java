package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

public class Human5922046 {

  public static Date setExpirationDate(
    Date date,
    int calendarField,
    int amount
  ) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    cal.add(calendarField, amount);

    java.util.Date expirationDate = cal.getTime();

    return expirationDate;
  }
}
