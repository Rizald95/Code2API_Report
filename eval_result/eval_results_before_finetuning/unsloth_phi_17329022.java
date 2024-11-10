Title: How to subtract hours from a calendar instance
Question: 
                
Based on my understanding of the roll() method, I expected the below code to subtract 140 hours from the current time.  But it seems to be subtracting 20 hours.  Is this not the proper way to do this?

Calendar rightNow = Calendar.getInstance();
rightNow.roll(Calendar.HOUR, -140);

    
Answer: 
As per the java docs, the roll method does not change larger fields and it will roll the hour value in the range between 0 and 23.

So in your case, considering HOUR_OF_DAY, 140 is actually considered as (24 * 5) + 20 = 140. Now since it does not change larger fields the "hour" is rolled back by 24 hours 5 times which gets it back to the same time and then it rolls it back by 20 hours.

To achieve a "real" 140 hours roll back you can do it like - 

    Calendar rightNow = Calendar.getInstance();
    rightNow.add(Calendar.HOUR, -140);

    
Code:     Calendar rightNow = Calendar.getInstance();
    rightNow.add(Calendar.HOUR, -140);

Complete the code as a full Java method.

Answer:

Here is a complete Java method that subtracts 140 hours from the current time using the Calendar class:

```java
import java.util.Calendar;

public class SubtractHours {

    public static void main(String[] args) {
        subtractHours(140);
    }

    public static void subtractHours(int hours) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.add(Calendar.HOUR, -hours);

        // Optional: Print the new time
        System.out.println("Time after subtracting " + hours + " hours: " + rightNow