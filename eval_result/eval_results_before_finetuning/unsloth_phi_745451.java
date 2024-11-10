Title: How to determine the date one day prior to a given date in Java?
Question: 
                
I am assuming Java has some built-in way to do this.

Given a date, how can I determine the date one day prior to that date?

For example, suppose I am given 3/1/2009. The previous date is 2/28/2009. If I had been given 3/1/2008, the previous date would have been 2/29/2008.
    
Answer: 
Use the Calendar interface.

Calendar cal = Calendar.getInstance();
cal.setTime(myDate);
cal.add(Calendar.DAY_OF_YEAR,-1);
Date oneDayBefore= cal.getTime();


Doing "addition" in this way guarantees you get a valid date.  This is valid for 1st of the year as well, e.g. if myDate is January 1st, 2012, oneDayBefore will be December 31st, 2011.
    
Code: Calendar cal = Calendar.getInstance();
cal.setTime(myDate);
cal.add(Calendar.DAY_OF_YEAR,-1);
Date oneDayBefore= cal.getTime();

Complete the code as a full Java method.


Answer:
Here is a complete Java method that takes a Date object as input and returns a Date object representing the date one day before the input date:

```java
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    public static Date getDateOneDayBefore(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_YEAR, -1);
        return cal.getTime();
    }

    public static void main(String[] args) {
        // Example usage:
        Date currentDate = new