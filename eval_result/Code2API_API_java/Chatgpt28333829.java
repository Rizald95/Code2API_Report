package com.chatgpt.api;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Chatgpt28333829 {
    public static void printFormattedDate(String inputDate, String timezone) throws ParseException {
        Date receivedDateObj = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss");
        formatter.setTimeZone(TimeZone.getTimeZone(timezone));
        receivedDateObj = formatter.parse(inputDate);
        System.out.println(formatter.format(receivedDateObj));
    }
}
