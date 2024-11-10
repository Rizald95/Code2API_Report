Title: How to get local time of different time zones?
Question: 
                
I want to get local time of different time zones using Java code. Based on the time zone passed to the function I need that time zone's local time. How to achieve this?
    
Answer: 
java.util.TimeZone tz = java.util.TimeZone.getTimeZone("GMT+1");
java.util.Calendar c = java.util.Calendar.getInstance(tz);

System.out.println(c.get(java.util.Calendar.HOUR_OF_DAY)+":"+c.get(java.util.Calendar.MINUTE)+":"+c.get(java.util.Calendar.SECOND));

    
Code: java.util.TimeZone tz = java.util.TimeZone.getTimeZone("GMT+1");
java.util.Calendar c = java.util.Calendar.getInstance(tz);

System.out.println(c.get(java.util.Calendar.HOUR_OF_DAY)+":"+c.get(java.util.Calendar.MINUTE)+":"+c.get(java.util.Calendar.SECOND));

Complete the code as a full Java method.

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneExample {

    public static void main(String[] args) {
        // Your code here
    }

    public static String getLocalTimeForTimeZone(String timeZoneId) {
        try {
            TimeZone tz = TimeZone.getTimeZone(timeZoneId);
            Calendar c = Calendar.getInstance(tz);

            int hour = c.get(Calendar.HOUR_OF_DAY);
            int minute = c.get(Calendar.MINUTE);
            int second = c.get(Calendar.SECOND);

