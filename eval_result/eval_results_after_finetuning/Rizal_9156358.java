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

# Answer
You can use the Calendar and TimeZone classes in Java to get the local time of different time zones. Here is the full Java method:


    import java.util.Calendar;
    import java.util.TimeZone;

    public class Test {

        public static String getTimeOfTimeZone(String timeZoneString) {
            TimeZone tz = TimeZone.getTimeZone(timeZoneString);
            Calendar c = Calendar.getInstance(tz);

            int h = c.get(Calendar.HOUR_OF_DAY);
            int m = c.get(Calendar.MINUTE);
            int s = c.get(