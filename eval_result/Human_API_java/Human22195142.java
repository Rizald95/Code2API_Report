package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Human22195142 {

  public static Date getTomorrowDate() {
    GregorianCalendar gc = new GregorianCalendar();
    gc.add(Calendar.DATE, 1);
    return gc.getTime();
  }
}
