Title: how to find seconds since 1970 in java
Question: 
                
iam working with a real time project where i got a requirement to find seconds since 1970 january 1.I have used the following code to find out seconds but is giving wrong result.The code is as follows.

public long returnSeconds(int year, int month, int date) {
    Calendar calendar1 = Calendar.getInstance();
    Calendar calendar2 = Calendar.getInstance();
    calendar1.set(1970, 01, 01);
    calendar2.set(year, month, date);
    long milliseconds1 = calendar1.getTimeInMillis();
    long milliseconds2 = calendar2.getTimeInMillis();
    long diff = milliseconds2 - milliseconds1;
    long seconds = diff / 1000;
    return seconds;
}


In the above in place of year,month,date I'm passing 2011,10,1 and iam getting 

1317510000


but the correct answer is 

1317427200


Any help regarding this is very useful to me.
    
Answer: 
Based on your desire that 1317427200 be the output, there are several layers of issue to address.


First as others have mentioned, java already uses a UTC 1/1/1970 epoch.  There is normally no need to calculate the epoch and perform subtraction unless you have weird locale rules.
Second, when you create a new Calendar it's initialized to 'now' so it includes the time of day.  Changing the year/month/day doesn't affect the time of day fields.  So if you want it to represent midnight of the date, you need to zero out the calendar before you set the date.
Third, you haven't specified how you're supposed to handle time zones.  Daylight Savings can cause differences in the absolute number of seconds represented by a particular calendar-on-the-wall-date, depending on where your JVM is running.  Since epoch is in UTC, we probably want to work in UTC as well.


Here's a full Java method that should work for you:

Calendar calendar = Calendar.getInstance();
calendar.set(Calendar.YEAR, year);
calendar.set(Calendar.MONTH, month-1);
calendar.set(Calendar.DAY_OF_MONTH, date);
calendar.set(Calendar.HOUR_OF_DAY, 0);
calendar.set(Calendar.MINUTE, 0);
calendar.set(Calendar.SECOND, 0);
calendar.set(Calendar.MILLISECOND, 0);

long milliseconds = calendar.getTimeInMillis();
long seconds = milliseconds