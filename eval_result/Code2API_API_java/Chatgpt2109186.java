package com.chatgpt.api;
import java.util.Calendar;
import java.util.Date;

public class Chatgpt2109186 {
    public static Date getFirstDayOfWeek(int week, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.WEEK_OF_YEAR, week);
        calendar.set(Calendar.YEAR, year);
        return calendar.getTime();
    }
}
