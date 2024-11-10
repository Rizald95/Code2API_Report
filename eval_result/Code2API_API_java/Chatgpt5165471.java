package com.chatgpt.api;
import java.util.Calendar;
import java.util.Date;

public class Chatgpt5165471 {
    public static Date setTimeToDate() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY,17);
        cal.set(Calendar.MINUTE,30);
        cal.set(Calendar.SECOND,0);
        cal.set(Calendar.MILLISECOND,0);

        Date d = cal.getTime();
        return d;
    }
}
