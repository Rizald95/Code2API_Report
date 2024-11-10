import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.chrono.IsoChronology;
import java.util.Locale;

public class LocaleSensitiveDateDisplay {

    public static void main(String[] args) {
        // Menggunakan locale en_US (English United States)
        Locale usLocale = Locale.US;
        displayLocaleSensitiveDate(usLocale);

        // Menggunakan locale en_GB (English Great Britain)
        Locale ukLocale = Locale.UK;
        displayLocaleSensitiveDate(ukLocale);
    }

    // Method untuk menampilkan tanggal yang sesuai dengan lokal
    private static void displayLocaleSensitiveDate(Locale locale) {
        // Mendapatkan pola format berdasarkan lokal
        String formatPattern = DateTimeFormatterBuilder.getLocalizedDateTimePattern(
                FormatStyle.FULL, null, IsoChronology.INSTANCE, locale);
        
        // Mengubah pola untuk hanya menampilkan Hari, Bulan, dan Tanggal (tanpa tahun)
        formatPattern = formatPattern.replaceFirst("^.*?([MLdEec].*[MLdEec]).*$", "$1");

        // Membuat formatter berdasarkan pola yang didapatkan
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(formatPattern, locale);

        // Menampilkan tanggal saat ini dengan zona waktu yang dipilih
        LocalDate currentDate = LocalDate.now(ZoneId.of("Pacific/Johnston"));
        String formattedDate = currentDate.format(dateFormatter);

        // Menampilkan hasil
        System.out.println("Formatted date for locale " + locale + ": " + formattedDate);
    }
}
