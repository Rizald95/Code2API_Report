package com.chatgpt.api;
import java.net.*;
import java.io.*;

public class Chatgpt3871163 {
    public static String convertDataInputStreamToString(DataInputStream dis) throws MalformedURLException, IOException {
        StringBuffer inputLine = new StringBuffer();
        String tmp; 
        while ((tmp = dis.readLine()) != null) {
            inputLine.append(tmp);
            System.out.println(tmp);
        }
        dis.close();
        return inputLine.toString();
    }
}
