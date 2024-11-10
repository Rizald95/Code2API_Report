

    import java.util.Date;
    import java.util.Calendar;
    
    public class Test {
    
        public static int getCurrentHourOfDay() {
            Date date = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
            return hourOfDay;
        }
    
        public static void main(String args[]) {
            System.out.println(getCurrentHourOfDay());
        }
    }

