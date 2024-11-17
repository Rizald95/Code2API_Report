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

# Answer

Here is the code as a full Java method.

Calendar cal = Calendar.getInstance();
int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);

String dayOfMonthStr = String.valueOf(dayOfMonth);

System.out.println(dayOfMonthStr);

# Answer

Here is the code as a full Java method.

Calendar cal = Calendar.getInstance();
int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);

String dayOfMonthStr = String.valueOf(dayOfMonth);

System.out.println(dayOfMonthStr);
