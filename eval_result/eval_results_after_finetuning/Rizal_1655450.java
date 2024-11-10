
import java.util.Calendar;

public class Main {

    public static void main(String args[]) {
        Date date = addSeconds(5, Calendar.getInstance());
        System.out.println(date);
    }

    public static Date addSeconds(int seconds, Calendar cal) {
        cal.add(Calendar.SECOND, seconds);
        return cal.getTime();
    }
}


