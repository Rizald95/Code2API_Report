Title: How to increment time by 1 hour
Question: 
                
I have two time values. one for the previous login time and one for the current login time. 
I have to increase previous time login by one hour. I have used the date format hh:mm:ss.
This is my code snippet. 

Date previous_time, current_time;

  if(previous_time.before(current_time)){
  Log.i("Time Comparision"," true");
 }


so instead of the above mentioned if condition, I have to add one hour to the previous_time and do the if condition. How to achieve this?
    
Answer: 
   Calendar calendar = Calendar.getInstance();
   calendar.setTime(previous_time);
   calendar.add(Calendar.HOUR, 1);
   previous_time = calendar.getTime();
   // do your comparison

    
Code:    Calendar calendar = Calendar.getInstance();
   calendar.setTime(previous_time);
   calendar.add(Calendar.HOUR, 1);
   previous_time = calendar.getTime();
   // do your comparison

Complete the code as a full Java method.

```java
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TimeIncrement {
    public static void main(String[] args) {
        Date previous_time = new Date(); // set your previous time here
        Date current_time = new Date(); // set your current time here

        previous_time = incrementTime(previous_time, 1);

        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
        System.out.println("Previous Time: " + formatter.format(previous_time));
        System.out.println("