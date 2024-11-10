package com.chatgpt.api;
import java.util.Calendar;

public class Chatgpt12899896 {
    public static Date addOneMonthAndGetSameDay(Date date) {
        final Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        
        int prevDayOfWeekInMonth = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        int prevDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        
        cal.add(Calendar.MONTH, 1);
        cal.set(Calendar.DAY_OF_WEEK, prevDayOfWeek);
        cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, prevDayOfWeekInMonth);
        
        return cal.getTime();
    }
}
