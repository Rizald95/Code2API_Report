import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class IsTimeInString {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Harap masukkan string sebagai argumen.");
            return;
        }

        String inputString = args[0];
        System.out.println(String.format("Is there a time in here: (%1$s)", inputString));
        
        // Memanggil metode untuk memeriksa apakah string mengandung waktu
        boolean containsTime = isTimeInString(inputString);
        
        if (containsTime) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Metode untuk memeriksa apakah string mengandung waktu dalam format 24-jam
    public static boolean isTimeInString(String str) {
        // Pola untuk mencocokkan format waktu (24-jam) seperti 14:15 atau 2:30
        Pattern pattern = Pattern.compile(".*([01]?[0-9]|2[0-3]):[0-5][0-9].*");
        Matcher matcher = pattern.matcher(str);
        
        // Mengembalikan true jika ada kecocokan
        return matcher.matches();
    }
}
