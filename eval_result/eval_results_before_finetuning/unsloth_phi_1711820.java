Title: How to create a calendar object in Java
Question: 
                
I need to turn a Date object into a calendar in Java, and try to access its field value for HOUR_OF_DAY. Does anybody know how to do it?
    
Answer: 
Use the setTime method:

Date date = new Date();
Calendar calendar = Calendar.getInstance();
calendar.setTime(date);
int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);

    
Code: Date date = new Date();
Calendar calendar = Calendar.getInstance();
calendar.setTime(date);
int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);

Complete the code as a full Java method.


Answer:
Here is a Java method that takes a Date object as input, converts it to a Calendar object, and retrieves the HOUR_OF_DAY value:

```java
import java.util.Date;
import java.util.Calendar;

public class DateToCalendar {

    public static int getHourOfDayFromDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
        return hourOfDay;
    }

    public static void main(String[] args) {
        // Example usage