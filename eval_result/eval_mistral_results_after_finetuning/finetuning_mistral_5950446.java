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

# Answer

You can use Calendar class in Java. Here is the complete the code as a full Java method.

    
Calendar calendar = Calendar.getInstance();
   calendar.setTime(previous_time);
   calendar.add(Calendar.HOUR, 1);
   previous_time = calendar.getTime();
   Date afterOneHour = previous_time;
   System.out.println(afterOneHour);

    
Code: Calendar calendar = Calendar.getInstance();
   calendar.setTime(previous_time);
   calendar.add(Calendar.HOUR, 1);
   previous_time = calendar.getTime