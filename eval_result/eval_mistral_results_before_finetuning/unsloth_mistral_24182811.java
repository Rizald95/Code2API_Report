Title: How to convert currentTimeMillis to a date in Java?
Question: 
                
I have milliseconds in certain log file generated in server, I also know the locale from where the log file was generated, my problem is to convert milliseconds to date in specified format.
The processing of that log is happening on server located in different time zone. While converting to "SimpleDateFormat" program is taking date of the machine as such formatted date do not represent correct time of the server. Is there any way to handle this elegantly ?

long yourmilliseconds = 1322018752992l;
        //1322018752992-Nov 22, 2011 9:25:52 PM 

SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS",Locale.US);

GregorianCalendar calendar = new GregorianCalendar(TimeZone.getTimeZone("US/Central"));
calendar.setTimeInMillis(yourmilliseconds);

System.out.println("GregorianCalendar -"+sdf.format(calendar.getTime()));

DateTime jodaTime = new DateTime(yourmilliseconds, 
                    DateTimeZone.forTimeZone(TimeZone.getTimeZone("US/Central")));
DateTimeFormatter parser1 = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss,SSS");

System.out.println("jodaTime "+parser1.print(jodaTime));


Output:

Gregorian Calendar -2011-11-23 08:55:52,992
jodaTime 2011-11-22 21:25:52,992

    
Answer: 
Calendar calendar = Calendar.getInstance();
calendar.setTimeInMillis(timeStamp);

int mYear = calendar.get(Calendar.YEAR);
int mMonth = calendar.get(Calendar.MONTH);
int mDay = calendar.get(Calendar.DAY_OF_MONTH);

    
Code: Calendar calendar = Calendar.getInstance();
calendar.setTimeInMillis(yourmilliseconds);

int mYear = calendar.get(Calendar.YEAR);
int mMonth = calendar.get(Calendar.MONTH) + 1; // Months are 0-based
int mDay = calendar.get(Calendar.DAY_OF_MONTH);
int mHour = calendar.get(Calendar.HOUR_OF_DAY);
int mMinute = calendar.get(Calendar.MINUTE);
int mSecond = calendar.get(Calendar.SECOND);
int mMillisecond = calendar.get(Calendar.MILLISECOND);

String dateFormat = "