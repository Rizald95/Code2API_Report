import java.util.logging.Logger;
import java.util.logging.Level;

public class TestLogger {

    public static void main(String[] args) {
        // Mengatur level log untuk 'wire' dan 'headers'
        Logger wireLogger = Logger.getLogger("org.apache.http.wire");
        wireLogger.setLevel(Level.FINEST);
        
        Logger headersLogger = Logger.getLogger("org.apache.http.headers");
        headersLogger.setLevel(Level.FINEST);

        // Menyetel properti untuk log output
        System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.SimpleLog");
        System.setProperty("org.apache.commons.logging.simplelog.showdatetime", "true");
        System.setProperty("org.apache.commons.logging.simplelog.log.httpclient.wire", "debug");
        System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.http", "debug");
        System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.http.headers", "debug");

        // Log telah diaktifkan, dan semua header HTTP akan ditampilkan di konsol saat Anda melakukan HTTP request menggunakan DefaultHttpClient.
    }
}
