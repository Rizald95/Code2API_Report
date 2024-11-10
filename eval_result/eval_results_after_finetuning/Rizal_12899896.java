
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
date.set(Calendar.DAY_OF_WEEK_IN_MONTH, prevDayOfWeekInMonth);
date.set(Calendar.DAY_OF_WEEK, prevDayOfWeek);

Alternatively you can use Joda Time
DateTime dateTime = new DateTime(2012, 9, 17, 17, 0, 0);
DateTime nextMonth = dateTime.plusMonths(1);
String nextWeekday = nextMonth.dayOfWeek().getNextOccurrence(DateTime.DAYOFWEEK.MONDAY).dayOfMonth