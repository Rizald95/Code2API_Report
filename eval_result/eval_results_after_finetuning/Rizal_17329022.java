
import java.util.Calendar;

public class Test {

    public static void main(String args[]) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.add(Calendar.HOUR, -140);
        
        System.out.println(rightNow.getTime());
    }
}

