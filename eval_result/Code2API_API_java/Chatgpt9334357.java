package com.chatgpt.api;
import java.security.*;

public class Chatgpt9334357 {
    public static void listAvailableCipherAlgorithms() {
        for (Provider provider: Security.getProviders()) {
            System.out.println(provider.getName());
            for (String key: provider.stringPropertyNames())
                System.out.println("\t" + key + "\t" + provider.getProperty(key));
        }
    }
}
