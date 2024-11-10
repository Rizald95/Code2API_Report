package com.chatgpt.api;
import java.util.Calendar;

public class Chatgpt1655450 {
    public static Date getFutureTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, 5);
        return calendar.getTime();
    }
}
