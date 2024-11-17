import java.util.Date;
import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println("Hour of day: " + hourOfDay);
    }
}