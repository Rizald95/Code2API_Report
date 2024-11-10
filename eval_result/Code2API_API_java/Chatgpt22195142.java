package com.chatgpt.api;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Chatgpt22195142 {
    public static GregorianCalendar getTomorrowDate() {
        GregorianCalendar gc = new GregorianCalendar();
        gc.add(Calendar.DATE, 1);
        return gc;
    }
}
