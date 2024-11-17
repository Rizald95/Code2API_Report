Title: How do I say 5 seconds from now in Java?
Question: 
                
I am looking at the Date documentation and trying to figure out how I can express NOW + 5 seconds. Here's some pseudocode:

import java.util.Date
public class Main {

    public static void main(String args[]) {
         Date now = new Date();
         now.setSeconds(now.getSeconds() + 5);
    }
}

    
Answer: 
Date is almost entirely deprecated and is still there for backward compatibility reasons. If you need to set particular dates or do date arithmetic, use a Calendar:

Calendar calendar = Calendar.getInstance(); // gets a calendar using the default time zone and locale.
calendar.add(Calendar.SECOND, 5);
System.out.println(calendar.getTime());

    
Code: Calendar calendar = Calendar.getInstance(); // gets a calendar using the default time zone and locale.
calendar.add(Calendar.SECOND, 5);
System.out.println(calendar.getTime());

Complete the code as a full Java method.

# Answer

Here is the full Java method as a complete your the code answer.

Calendar calendar = Calendar.getInstance(); // gets a calendar using the default time zone and locale.
calendar.add(Calendar.SECOND, 5);
System.out.println(calendar.getTime());


Complete the code as a full Java method.

# Answer

Here is the full Java method as a complete your the code answer.

Calendar calendar = Calendar.getInstance(); // gets a calendar using the default time zone and locale.
calendar.add(Calendar.SECOND, 5);
System.out.println(calendar.getTime());

    
