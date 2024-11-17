Title: How to specify firstDayOfWeek for java.util.Calendar using a JVM argument
Question: 
                
I'm trying to change default firstDayOfWeek for java.util.Calendar from SUNDAY to MONDAY. Is it possible to achieve this through JVM configuration instead of adding this piece of code?

cal.setFirstDayOfWeek(Calendar.MONDAY);

    
Answer: 
The first day of the week is derived from the current locale. If you don't set the locale of the calendar (Calendar.getInstance(Locale), or new GregorianCalendar(Locale)), it will use the system's default. The system's default can be overridden by a JVM parameter:

public static void main(String[] args) {
    Calendar c = new GregorianCalendar();
    System.out.println(Locale.getDefault() + ": " + c.getFirstDayOfWeek());
}


This should show a different output with different JVM parameters for language/country:


-Duser.language=en -Duser.country=US -> en_US: 1 (Sunday)
-Duser.language=en -Duser.country=GB -> en_GB: 2 (Monday)


Don't forget that this could change other behavio(u)r too.
    
Code: public static void main(String[] args) {
    Calendar c = new GregorianCalendar();
    System.out.println(Locale.getDefault() + ": " + c.getFirstDayOfWeek());
}

Complete the code as a full Java method.

# Answer

You can try with the following code:

public static void main(String[] args) {
    Calendar c = new GregorianCalendar();
    System.out.println(Locale.getDefault() + ": " + c.getFirstDayOfWeek());
}


# Answer

You can try with the following code:

public static void main(String[] args) {
    Calendar c = new GregorianCalendar();
    System.out.println(Locale.getDefault() + ": " + c.getFirstDayOfWeek());
}

Complete the code as a full Java method.

# Code

public static void main