Title: How to get day of the month?
Question: 
                
I am trying to retrieve which day of the month it is.

Such as today is August 29,2011.

What i would like to do is just get the days number such as 29, or 30. Which ever day of the month it is. 

How would i go about doing this?
    
Answer: 
You'll want to do get a Calendar instance and get it's day of month

Calendar cal = Calendar.getInstance();
int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);

String dayOfMonthStr = String.valueOf(dayOfMonth);


You can also get DAY_OF_WEEK, DAY_OF_YEAR, DAY_OF_WEEK_IN_MONTH, etc.
    
Code: Calendar cal = Calendar.getInstance();
int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);

String dayOfMonthStr = String.valueOf(dayOfMonth);

Complete the code as a full Java method.

Here's a complete Java method that retrieves the current day of the month as a string:

```java
import java.util.Calendar;

public class DayOfMonthRetriever {

    public static void main(String[] args) {
        String dayOfMonth = getCurrentDayOfMonth();
        System.out.println("The current day of the month is: " + dayOfMonth);
    }

    public static String getCurrentDayOfMonth() {
        Calendar cal = Calendar.getInstance();
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        return String.valueOf(dayOfMonth);
