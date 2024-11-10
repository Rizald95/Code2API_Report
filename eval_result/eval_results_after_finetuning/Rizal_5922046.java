import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, 6);

        Date expirationDate = cal.getTime();

        System.out.println(expirationDate);
    }
}