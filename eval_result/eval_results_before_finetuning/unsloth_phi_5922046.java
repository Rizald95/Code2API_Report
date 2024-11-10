Title: How to set an expiration date in java
Question: 
                
I am trying to write some code to correctly set an expiration date given a certain date.

For instance this is what i have. 

    Date lastSignupDate = m.getLastSignupDate();
    long expirationDate = 0;
    long milliseconds_in_half_year = 15778463000L;
    expirationDate = lastSignupDate.getTime() + milliseconds_in_half_year; 
    Date newDate = new Date(expirationDate);


However, say if i the sign up date is on 5/7/2011 the expiration date output i get is on 11/6/2011 which is not exactly half of a year from the given date.  Is there an easier way to do this?
    
Answer: 
I would use the Calendar class - the add method will do this kind of thing perfectly.

http://download.oracle.com/javase/6/docs/api/java/util/Calendar.html

    Date date = new Date();
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    cal.add(Calendar.MONTH, 6);

            java.util.Date expirationDate = cal.getTime();

    System.err.println(expirationDate);

    
Code:     Date date = new Date();
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    cal.add(Calendar.MONTH, 6);

            java.util.Date expirationDate = cal.getTime();

    System.err.println(expirationDate);

Complete the code as a full Java method.

Answer:
Here's a complete Java method that sets an expiration date to exactly half a year from a given date:

```java
import java.util.Date;
import java.util.Calendar;

public class DateExpirationSetter {

    public static Date setExpirationDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, 6);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
        cal.set(Calendar.HOUR_OF_DAY