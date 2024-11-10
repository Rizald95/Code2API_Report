
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class FirstDayOfWeekExample {

    public static void printFirstDayOfWeek() {
        Calendar calendar = new GregorianCalendar();
        System.out.println("Locale: " + Locale.getDefault() + ", First Day of Week: " + calendar.getFirstDayOfWeek());
    }

    public static void main(String[] args) {
        printFirstDayOfWeek();
