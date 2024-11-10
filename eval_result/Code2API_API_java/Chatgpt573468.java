package com.chatgpt.api;
public class Chatgpt573468 {
    public static void connectToSecureWebsite() {
        System.setProperty("javax.net.ssl.trustStore", "myTrustStore");
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
        System.setProperty("javax.net.ssl.keyStoreType", "pkcs12");
        System.setProperty("javax.net.ssl.keyStore", "new.p12");
        System.setProperty("javax.net.ssl.keyStorePassword", "newpasswd");
    }
}
