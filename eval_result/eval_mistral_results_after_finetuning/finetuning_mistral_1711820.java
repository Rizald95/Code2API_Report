Title: How to create a calendar object in Java
Question: 
                
I need to turn a Date object into a calendar in Java, and try to access its field value for HOUR_OF_DAY. Does anybody know how to do it?
    
Answer: 
Use the setTime method:

Date date = new Date();
Calendar calendar = Calendar.getInstance();
calendar.setTime(date);
int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);

    
Code: Date date = new Date();
Calendar calendar = Calendar.getInstance();
calendar.setTime(date);
int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);

Complete the code as a full Java method.

# Answer

Here is the full Java method as a complete your the code answer.

Date date = new Date();
Calendar calendar = Calendar.getInstance();
calendar.setTime(date);
int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);

System.out.println(hourOfDay);

# Answer

Here is the code you can complete as a full Java method.

Date date = new Date();
Calendar calendar = Calendar.getInstance();
calendar.setTime(date);
int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);

System.out.println(hourOfDay