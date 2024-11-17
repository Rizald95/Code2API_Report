Title: How to know if now time is between two hours?
Question: 
                
I have a now time:

new Date();


And I have some hour constants, for example, 23 and 8 (it's 11pm or 23:00, 8am or 08:00).
How I can know is now time between it's two hour constants?

It need to run some code of program or not to run if now time is between in two hours, for example, do not run some code if its already evening and while it is not a morning.

Here the image to better explain:



Some situations when silent mode does not fire:

00:00 20.06.13 - 23:00 20.06.13 // after 23.00 can loud!!

23:00 20.06.13 - 15:00 20.06.13 // after 15.00 can loud!!

01:00 20.06.13 - 08:00 20.06.13 // after 08.00 can loud!!

21:00 20.06.13 - 08:00 20.06.13 // after 08.00 can loud!!

    
Answer: 
try this

    int from = 2300;
    int to = 800;
    Date date = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(date);
    int t = c.get(Calendar.HOUR_OF_DAY) * 100 + c.get(Calendar.MINUTE);
    boolean isBetween = to > from && t >= from && t <= to || to < from && (t >= from || t <= to);

    
Code:     int from = 2300;
    int to = 800;
    Date date = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(date);
    int t = c.get(Calendar.HOUR_OF_DAY) * 100 + c.get(Calendar.MINUTE);
    boolean isBetween = to > from && t >= from && t <= to || to < from && (t >= from || t <= to);

Complete the code as a full Java method.

# Answer

You can use Calendar class in Java.

int from = 2300;
int to = 800;
Date date = new Date();
Calendar c = Calendar.getInstance();
c.setTime(date);
int t = c.get(Calendar.HOUR_OF