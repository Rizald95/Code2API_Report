package com.chatgpt.api;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Chatgpt18070669 {
    public static void writeToFile(String text) throws Exception {
        FileWriter fWriter = null;
        BufferedWriter writer = null;
        try {
            fWriter = new FileWriter("text.txt");
            writer = new BufferedWriter(fWriter);
            writer.write(text);
            writer.newLine();
            writer.close();
            System.err.println("Your input of " + text.length() + " characters was saved.");
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
