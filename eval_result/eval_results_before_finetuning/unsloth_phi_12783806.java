Title: How to get the last Sunday before current date? [duplicate]
Question: 
                    
            
        
            
                
                    
                            
                                This question already has an answer here:
                                
                            
                    
                
            
                    
                        How to get previous/last Saturday for a given date in Java?
                            
                                (1 answer)
                            
                    
                Closed 2 years ago.
        


    

I have the following code for getting the last Sunday before the current date:

Calendar calendar=Calendar.getInstance();
calendar.set(Calendar.WEEK_OF_YEAR, calendar.get(Calendar.WEEK_OF_YEAR)-1);
calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
Log.e("first day", String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)));


But this code doesn't work. Please, tell me, how can I fix it? 
    
Answer: 
This will work. We first get the day count, and then subtract that with the current day and add 1 ( for sunday)

Calendar cal=Calendar.getInstance();
cal.add( Calendar.DAY_OF_WEEK, -(cal.get(Calendar.DAY_OF_WEEK)-1)); 
System.out.println(cal.get(Calendar.DATE));


Edit : As pointed out by Basil Bourque in the comment, see the  answer by Grzegorz Gajos for Java 8 and later.
    
Code: Calendar cal=Calendar.getInstance();
cal.add( Calendar.DAY_OF_WEEK, -(cal.get(Calendar.DAY_OF_WEEK)-1)); 
System.out.println(cal.get(Calendar.DATE));

Complete the code as a full Java method.


Answer:
Here is a complete Java method that returns the date of the last Sunday before the current date:

```java
import java.util.Calendar;
import java.util.Date;

public class LastSundayFinder {

    public static Date getLastSundayBefore(Date currentDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);

        // Get the current day of the week (0 is Sunday, 1 is Monday, etc.)
        int currentDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Calculate the difference between the current day