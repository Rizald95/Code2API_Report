package com.chatgpt.api;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Chatgpt4499595 {
    public static void saveDataToFile(String data) throws IOException {
        FileWriter fstream = new FileWriter(System.currentTimeMillis() + "out.txt");
        BufferedWriter out = new BufferedWriter(fstream);
        out.write(data);
        out.close();
    }
}
