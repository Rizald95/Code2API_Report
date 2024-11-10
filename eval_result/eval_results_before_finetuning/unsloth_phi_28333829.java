Title: How to parse time in correct timezone java?
Question: 
                
I am parsing a time stamp which is a string as follows:

Date receivedDateObj = new Date();
String inputDate = "Fri, 31 Dec 1999 23:59:59";
SimpleDateFormat formatter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss");
                try {
                    System.out.println(inputDate);
                    formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
                    receivedDateObj = formatter.parse(inputDate);
                }catch (ParseException e) {

                }
System.out.println(receivedDateObj);


The date gets parsed correctly but when I print the date, it prints the following:

Fri Dec 31 18:59:59 EST 1999


How do I get it to print GMT instead of EST? Why is the timezone not getting set despite me setting it using the following?

formatter.setTimeZone(TimeZone.getTimeZone("UTC"));

    
Answer: 
A java.util.Date object has no timezone information.  It's a fixed instant in time.  Dumping to the console just uses Date.toString(); which uses the JVM's timezone to perform the format.  If you want to convert your fixed instant in time back to a 'human' representation in a particular timezone, just send it back through your formatter the other way.

System.out.println(formatter.format(receivedDateObj));

    
Code: System.out.println(formatter.format(receivedDateObj));

Complete the code as a full Java method.


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ParseTime {

    public static void main(String[] args) {
        Date receivedDateObj = new Date();
        String inputDate = "Fri, 31 Dec 1999 23:59:59";
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss");
        try {
            formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
            receivedDateObj =