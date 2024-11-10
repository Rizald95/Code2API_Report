package com.chatgpt.api;
import java.util.Date;
import java.util.Calendar;

public class Chatgpt17213258 {
    public static boolean isNowTimeBetweenTwoHours() {
        int from = 2300;
        int to = 800;
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int t = c.get(Calendar.HOUR_OF_DAY) * 100 + c.get(Calendar.MINUTE);
        boolean isBetween = to > from && t >= from && t <= to || to < from && (t >= from || t <= to);
        return isBetween;
    }
}
