package com.chatgpt.api;
import java.util.Calendar;
import java.util.Date;

public class Chatgpt5922046 {
    public static Date setExpirationDate(Date lastSignupDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(lastSignupDate);
        cal.add(Calendar.MONTH, 6);
        return cal.getTime();
    }
}
