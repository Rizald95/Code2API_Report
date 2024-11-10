package com.stackoverflow.api;

import java.util.Calendar;

public class Human24182811 {

  public static int[] fromMillsToDate(long timeStamp) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTimeInMillis(timeStamp);
    int out[] = new int[3];
    out[0] = calendar.get(Calendar.YEAR);
    out[1] = calendar.get(Calendar.MONTH);
    out[2] = calendar.get(Calendar.DAY_OF_MONTH);
    return out;
  }
}
