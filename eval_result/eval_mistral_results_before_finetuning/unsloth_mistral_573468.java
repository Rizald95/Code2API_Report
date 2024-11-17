Title: How to connect to a secure website using SSL in Java with a pkcs12 file?
Question: 
                
I have a pkcs12 file. I need to use this to connect to a webpage using https protocol. I came across some code where in order to connect to a secure web page i need to set the following system properties:

System.setProperty("javax.net.ssl.trustStore", "myTrustStore");
System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
System.setProperty("javax.net.ssl.keyStoreType", "pkcs12");
System.setProperty("javax.net.ssl.keyStore", "new_cert.p12");
System.setProperty("javax.net.ssl.keyStorePassword", "newpass");


I have the p12(pkcs12) file. All I need is a truststore file.

I extracted the certificates using:

openssl.exe pkcs12 -in c:/mykey.p12 -out c:/cert.txt -nokeys -clcerts


Now converted the cert PEM file to der

openssl.exe x509 -in c:/cert.txt -outform DER -out c:/CAcert.der 


Now adding the der file to a keystore

keytool -import -file C:/Cacert.der -keystore mytruststore


Now I have the truststore, but when I use it, I get the following error

Exception in thread "main" java.net.SocketException: java.security.NoSuchAlgorithmException: Error constructing implementation (algorithm: Default, provider: SunJSSE, class: com.sun.net.ssl.internal.ssl.DefaultSSLContextImpl)


Update:
 After removing certain properties and setting only the "trustStore", "trustStorePassword" and "trustStoreType" property, I got the following exception

java.security.InvalidAlgorithmParameterException: the trustAnchors parameter must be non-empty


Please Help.
    
Answer: 
For anyone encountering a similar situation I was able to resolve the issue by using the following code:

```java
import java.io.FileInputStream;
import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

public class SSLConnection {
    public static void main(String[] args) throws Exception {
        String keyStorePath = "path/to/your/keystore.p12";
        String keyStorePassword = "your_keystore_password";
        String trustStorePath = "path/to/your/truststore.jks";
       