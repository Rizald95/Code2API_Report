import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        
        String dayOfMonthStr = String.valueOf(dayOfMonth);
        
        System.out.println(dayOfMonthStr);
    }
}