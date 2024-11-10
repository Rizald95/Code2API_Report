package com.chatgpt.api;
import java.util.TimeZone;
import java.util.Calendar;

public class Chatgpt9156358 {
    public static void getLocalTime(String timeZone) {
        TimeZone tz = TimeZone.getTimeZone(timeZone);
        Calendar c = Calendar.getInstance(tz);

        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
    }
}
