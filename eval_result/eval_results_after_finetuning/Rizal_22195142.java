Title: Android how to get tomorrow's date
Question: 
                
In my android application. I need to display tomorrow's date, for example today is 5th March so I need to display as 6 March. I know the code for getting today's date, month and year.

date calculating

    GregorianCalendar gc = new GregorianCalendar();
    yearat = gc.get(Calendar.YEAR);
    yearstr = Integer.toString(yearat);
    monthat = gc.get(Calendar.MONTH) + 1;
    monthstr = Integer.toString(monthat);
    dayat = gc.get(Calendar.DAY_OF_MONTH);
    daystr = Integer.toString(dayat);


If I have the code

dayat = gc.get(Calendar.DAY_OF_MONTH) + 1;


will it display tomorrow's date. or just add one to today's date? For example, if today is January 31. With the above code, will it display like 1 or 32? If it displays 32, what change I need to make?
    
Answer: 

Get today's date as a Calendar.
Add 1 day to it.
Format for display purposes.


For example,

GregorianCalendar gc = new GregorianCalendar();
gc.add(Calendar.DATE, 1);
// now do something with the calendar

    
Code: GregorianCalendar gc = new GregorianCalendar();
gc.add(Calendar.DATE, 1);
// now do something with the calendar

Complete the code as a full Java method.

# Answer

You can use the add method of the GregorianCalendar class to get the date of the next day. The add method takes two parameters: a field constant and an amount. The field constant represents the date component you want to modify, such as Calendar.DATE, Calendar.MONTH, or Calendar.YEAR. The amount represents how much you want to add or subtract from the current value of the field. If the amount is positive, it means you want to increase the value. If the amount is negative, it means you want to decrease the value.

For example, if you want to get the date of the next day, you can use Calendar.DATE as the field constant and 1