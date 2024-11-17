Title: How to convert minutes to Hours and Minutes (hh:mm) in Java?
Question: 
                
I need to convert minutes to hours and minutes in Java. For example 260 minutes should be 4:20.
Can anyone help me how to do such conversion?
    
Answer: 
If your time is in a variable called t :
int hours   = t / 60;   // since both are ints, you get an int
int minutes = t % 60;
System.out.printf("%d:%02d", hours, minutes);

It couldn't get easier.

Addendum from 2021
Please notice that this answer is about the literal meaning of the question: how to convert an amount of minute to hours + minutes. It has nothing to do with time, time zones, AM/PM etc.
If you need better control about this kind of stuff, i.e. you're dealing with moments in time and not just an amount of minutes and hours, see Basil Bourque's answer below.
    
Code: int hours   = t / 60;   // since both are ints, you get an int
int minutes = t % 60;
System.out.printf("%d:%02d", hours, minutes);

Complete the code as a full Java method.

# Answer

You can try the following code:

int hours   = t / 60;   // since both are ints, you get an int
int minutes = t % 60;
System.out.printf("%d:%02d", hours, minutes);

# Answer

You can try the following code:

int hours   = t / 60;   // since both are ints, you get an int
int minutes = t % 60;
System.out.printf("%d:%02d", hours, minutes);

Complete the code as a full Java method.

# Code

int hours   = t