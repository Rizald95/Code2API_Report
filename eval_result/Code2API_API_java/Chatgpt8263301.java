package com.chatgpt.api;
import java.util.Calendar;
import java.util.TimeZone;

public class Chatgpt8263301 {
    public static long getSecondsSinceEpoch(int year, int month, int date) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        calendar.set(year, month, date);
        return calendar.getTimeInMillis() / 1000L;
    }
}
