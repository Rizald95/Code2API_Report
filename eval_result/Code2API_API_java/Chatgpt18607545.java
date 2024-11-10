package com.chatgpt.api;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Chatgpt18607545 {
    public static void splitAndReadFile(String fileName) throws IOException {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(fileName));
            String read = null;
            while ((read = in.readLine()) != null) {
                String[] splited = read.split("\\s+");
                for (String part : splited) {
                    System.out.println(part);
                }
            }
        } catch (IOException e) {
            System.out.println("There was a problem: " + e);
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }
    }
}
