import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;
import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

public class SSLConnectionExample {

    public static void main(String[] args) {
        try {
            // Lokasi file keystore dan truststore
            String keyStorePath = "path/to/your/new_cert.p12";  // File pkcs12
            String trustStorePath = "path/to/your/mytruststore";  // Truststore file
            
            // Set properti SSL
            System.setProperty("javax.net.ssl.trustStore", trustStorePath);
            System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
            System.setProperty("javax.net.ssl.keyStoreType", "pkcs12");
            System.setProperty("javax.net.ssl.keyStore", keyStorePath);
            System.setProperty("javax.net.ssl.keyStorePassword", "newpass");
            
            // Load the keystore
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            try (FileInputStream keyStoreFile = new FileInputStream(keyStorePath)) {
                keyStore.load(keyStoreFile, "newpass".toCharArray());
            }

            // Initialize KeyManagerFactory with the keystore
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            keyManagerFactory.init(keyStore, "newpass".toCharArray());

            // Load the truststore
            KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
            try (FileInputStream trustStoreFile = new FileInputStream(trustStorePath)) {
                trustStore.load(trustStoreFile, "changeit".toCharArray());
            }

            // Initialize TrustManagerFactory with the truststore
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(trustStore);

            // Initialize SSLContext
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(keyManagerFactory.getKeyManagers(), trustManagerFactory.getTrustManagers(), null);

            // Set SSLContext as the default
            SSLContext.setDefault(sslContext);

            // Membuat koneksi HTTPS ke URL target
            URL url = new URL("https://your-secure-site.com");
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.setSSLSocketFactory(sslContext.getSocketFactory());

            // Lakukan koneksi
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();

            System.out.println("Response Code : " + responseCode);

            // Membaca response dari server
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Output response dari server
            System.out.println(response.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
