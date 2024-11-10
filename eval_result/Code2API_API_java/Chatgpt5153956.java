package com.chatgpt.api;
import java.math.BigInteger;

public class Chatgpt5153956 {
    public static String convertHexStringToLong(String hexString) {
        BigInteger bi = new BigInteger(hexString, 16);
        return bi.toString();
    }
}
