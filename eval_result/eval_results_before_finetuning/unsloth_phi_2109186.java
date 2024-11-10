Title: How to get first day of a given week number in Java
Question: 
                
Let me explain myself. By knowing the week number and the year of a date:

Date curr = new Date();
Calendar cal = Calendar.getInstance();
cal.setTime(curr);
int nweek = cal.WEEK_OF_YEAR;
int year = cal.YEAR;


But now I don't know how to get the date of the first day of that week. I've been looking in Calendar, Date, DateFormat but nothing that may be useful... 

Any suggestion? (working in Java)
    
Answer: 
Those fields does not return the values. Those are constants which identifies the fields in the Calendar object which you can get/set/add. To achieve what you want, you first need to get a Calendar, clear it and set the known values. It will automatically set the date to first day of that week.

// We know week number and year.
int week = 3;
int year = 2010;

// Get calendar, clear it and set week number and year.
Calendar calendar = Calendar.getInstance();
calendar.clear();
calendar.set(Calendar.WEEK_OF_YEAR, week);
calendar.set(Calendar.YEAR, year);

// Now get the first day of week.
Date date = calendar.getTime();


Please learn to read the javadocs to learn how to use classes/methods/fields and do not try to poke random in your IDE ;)

That said, the java.util.Date and java.util.Calendar are epic failures. If you can, consider switching to Joda Time.
    
Code: // We know week number and year.
int week = 3;
int year = 2010;

// Get calendar, clear it and set week number and year.
Calendar calendar = Calendar.getInstance();
calendar.clear();
calendar.set(Calendar.WEEK_OF_YEAR, week);
calendar.set(Calendar.YEAR, year);

// Now get the first day of week.
Date date = calendar.getTime();

Complete the code as a full Java method.

Here's a complete method that takes a week number and a year, and returns the first day of that week as a Date object:

```java
import java.util.Calendar;
import java.util.Date;

public class WeekdayFinder {

    public static Date getFirstDayOfWeek(int week, int year) {
        // Get the current calendar instance
        Calendar calendar = Calendar.getInstance();
        
        // Clear the calendar to set specific values
        calendar.clear();
        
        // Set the week of year and the year
        calendar.set(Calendar.WEEK_OF_YEAR, week);
        calendar.set