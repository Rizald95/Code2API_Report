package com.chatgpt.api;
import java.util.Calendar;

public class Chatgpt7226186 {
    public static String getDayOfMonth() {
        Calendar cal = Calendar.getInstance();
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        String dayOfMonthStr = String.valueOf(dayOfMonth);
        return dayOfMonthStr;
    }
}
