import java.util.Calendar;
import java.util.Locale;

public class TestCalendar {

    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
        System.out.println(Locale.getDefault() + ": " + c.getFirstDayOfWeek());
    }
}