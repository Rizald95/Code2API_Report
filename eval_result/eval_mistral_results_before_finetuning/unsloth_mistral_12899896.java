Title: How to add one month to a date and get the same day
Question: 
                
I try to add one month to a date depending on weekdays. Fore example the date is the 3. Monday of September. After adding I want have the 3. Monday of October.
I tried to add one month to following date

Mon Sep 17 17:30:00 MESZ 2012


with this code:

Calendar date = Calendar.getInstance();
date.setTimeInMillis(date_in_mil);
date.add(Calendar.DAY_OF_WEEK_IN_MONTH, 3); 


But I got

Mon Oct 08 17:30:00 MESZ 2012


which is the second Monday of Oct and not the third. Has anybody an idea how this workes?

EDIT
This is the solution I used like in the answer below:

int prevDayOfWeek = date.get(Calendar.DAY_OF_WEEK);
date.add(Calendar.MONTH, 1);
date.set(Calendar.DAY_OF_WEEK, prevDayOfWeek);
date.set(Calendar.DAY_OF_WEEK_IN_MONTH, week);


wereby week is the number of the week in a month. Fore example 1 means the first, 2 the second, and so on. But week can also count backwards, fore example -1 means the last week of month.
    
Answer: 
If you want get 3rd monday of month, then use
set instead of add
date.set(Calendar.DAY_OF_WEEK_IN_MONTH, 3);  

if you want add one month to current date, use
date.add(Calendar.MONTH, 1);  

EDIT   

final Calendar date = Calendar.getInstance();
date.set(2012, Calendar.SEPTEMBER, 17);

int prevDayOfWeekInMonth = date.get(Calendar.DAY_OF_WEEK_IN_MONTH);
int prevDayOfWeek = date.get(Calendar.DAY_OF_WEEK);

date.add(Calendar.MONTH, 1);
date.set(Calendar.DAY_OF_WEEK, prevDayOfWeek);
date.set(Calendar.DAY_OF_WEEK_IN_MONTH, prevDayOfWeekInMonth);

System.out.println(date.getTime());

This will give you the 3rd Monday of October.

If you want to get the 3rd Monday of any month, you can use this code:

final Calendar date = Calendar.getInstance();
date.set(2012, Calendar.SEPTEMBER, 17);