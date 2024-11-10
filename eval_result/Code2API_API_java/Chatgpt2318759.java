package com.chatgpt.api;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class Chatgpt2318759 {
    public static boolean isProcessRunning(String processName) throws RuntimeException {
        String[] command = new String[]{ "powershell", "ps", processName };
        try {
            if (System.getProperty("os.name").toLowerCase().contains("linux")) {
                command = new String[]{ "ps", "-o", "comm" };
            }
            Process ps = new ProcessBuilder(command).start();
            return new BufferedReader(
                    new InputStreamReader(ps.getInputStream(), StandardCharsets.UTF_8)
            ).lines().anyMatch(line -> line.contains(processName));

        } catch (IOException e) {
            throw new RuntimeException(String.join(" ", command) + ": No such command on this OS.");
        }
    }
}
