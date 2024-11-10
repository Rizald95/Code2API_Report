package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

public class Human23307365 {

  public static Date addTwoWeeksToDate(Date dateOfOrder) {
    int noOfDays = 14; //i.e two weeks
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(dateOfOrder);
    calendar.add(Calendar.DAY_OF_YEAR, noOfDays);
    return calendar.getTime();
  }
}
