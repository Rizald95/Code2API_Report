Title: How to set time to a date object in java
Question: 
                
I created a Date object in Java. When I do so, it shows something like: date=Tue Aug 09 00:00:00 IST 2011. As a result, it appears that my Excel file is lesser by one day (27 feb becomes 26 feb and so on) I think it must be because of time. How can I set it to something like 5:30 pm?
    
Answer: 
Calendar cal = Calendar.getInstance();
cal.set(Calendar.HOUR_OF_DAY,17);
cal.set(Calendar.MINUTE,30);
cal.set(Calendar.SECOND,0);
cal.set(Calendar.MILLISECOND,0);

Date d = cal.getTime();


Also See


Joda time
Calendar doc

    
Code: Calendar cal = Calendar.getInstance();
cal.set(Calendar.HOUR_OF_DAY,17);
cal.set(Calendar.MINUTE,30);
cal.set(Calendar.SECOND,0);
cal.set(Calendar.MILLISECOND,0);

Date d = cal.getTime();

Complete the code as a full Java method.

```
import java.util.Calendar;
import java.util.Date;

public class SetTimeToDate {
    public static Date setTimeToDate(int hourOfDay, int minute, int second) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, hourOfDay);
        cal.set(Calendar.MINUTE, minute);
        cal.set(Calendar.SECOND, second);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }
}
```

You can use this method to set the