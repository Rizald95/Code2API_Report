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

```java
import java.util.TimeZone;
import java.util.Calendar;

public class TimeZoneExample {
    public static void main(String[] args) {
        getLocalTime("GMT+1");
        getLocalTime("GMT-5");
        getLocalTime("Asia/Kolkata");
    }

    public static void getLocalTime(String timeZone) {
        TimeZone tz = TimeZone.getTimeZone(timeZone);
        Calendar c = Calendar.getInstance(tz);

        System.out.println(timeZone + ": " + c.get(Calendar.HOUR_OF