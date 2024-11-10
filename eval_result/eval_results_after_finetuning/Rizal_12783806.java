

    
    import java.util.Calendar;
    
    public class DateExample {
        public static void main(String[] args) {
            Calendar cal = Calendar.getInstance();
            cal.add( Calendar.DAY_OF_WEEK, -(cal.get(Calendar.DAY_OF_WEEK)-1));
            System.out.println(cal.get(Calendar.DATE));
        }
    }

