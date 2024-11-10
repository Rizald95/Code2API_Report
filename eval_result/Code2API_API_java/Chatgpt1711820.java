package com.chatgpt.api;
import java.util.Calendar;
import java.util.Date;

public class Chatgpt1711820 {
    public static int createCalendarObject(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.HOUR_OF_DAY);
    }
}
