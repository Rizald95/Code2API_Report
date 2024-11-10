package com.chatgpt.api;
import java.util.Calendar;
import java.util.Date;

public class Chatgpt745451 {
    public static Date getPreviousDate(Date currentDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(currentDate);
        cal.add(Calendar.DAY_OF_YEAR, -1);
        return cal.getTime();
    }
}
