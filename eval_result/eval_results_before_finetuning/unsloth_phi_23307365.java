Title: How do I add 2 weeks to a Date in java? [duplicate]
Question: 
                    
            
        
            
                
                    
                            
                                This question already has answers here:
                                
                            
                    
                
            
                    
                        Modify the week in a Calendar
                            
                                (4 answers)
                            
                    
                Closed 6 years ago.
        


    

I am getting a Date from the object at the point of instantiation, and for the sake of outputting I need to add 2 weeks to that date. I am wondering how I would go about adding to it and also whether or not my syntax is correct currently.

Current Java:

private final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
private Date dateOfOrder;

private void setDateOfOrder()
{
    //Get current date time with Date()
    dateOfOrder = new Date();      
}

public Date getDateOfOrder()
{
    return dateOfOrder;
}


Is this syntax correct? Also, I want to make a getter that returns an estimated shipping date, which is 14 days after the date of order, I'm not sure how to add and subtract from the current date.
    
Answer: 
Use Calendar and set the current time then user the add method of the calendar

try this:    

int noOfDays = 14; //i.e two weeks
Calendar calendar = Calendar.getInstance();
calendar.setTime(dateOfOrder);            
calendar.add(Calendar.DAY_OF_YEAR, noOfDays);
Date date = calendar.getTime();

    
Code: int noOfDays = 14; //i.e two weeks
Calendar calendar = Calendar.getInstance();
calendar.setTime(dateOfOrder);            
calendar.add(Calendar.DAY_OF_YEAR, noOfDays);
Date date = calendar.getTime();

Complete the code as a full Java method.

public Date getEstimatedShippingDate() {
    int noOfDays = 14; //i.e two weeks
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(dateOfOrder);
    calendar.add(Calendar.DAY_OF_YEAR, noOfDays);
    Date date = calendar.getTime();
    return date;
}


A: Here is a complete example:
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd H