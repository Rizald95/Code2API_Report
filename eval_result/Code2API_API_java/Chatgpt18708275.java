package com.chatgpt.api;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chatgpt18708275 {
    public static void executeBashCommandWithSudo() throws IOException {
        String[] cmd = {"/bin/bash","-c","echo password| sudo -S ls"};
        Process pb = Runtime.getRuntime().exec(cmd);

        String line;
        BufferedReader input = new BufferedReader(new InputStreamReader(pb.getInputStream()));
        while ((line = input.readLine()) != null) {
            System.out.println(line);
        }
        input.close();
    }
}
