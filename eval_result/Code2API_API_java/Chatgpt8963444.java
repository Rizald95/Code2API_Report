package com.chatgpt.api;
import java.io.*;

public class Chatgpt8963444 {
    public static String runWindowsCommand(String command) throws IOException, InterruptedException {
        StringBuilder output = new StringBuilder();
        Process p;
        try {
            p = Runtime.getRuntime().exec("cmd /c " + command);
            p.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        return output.toString();
    }
}
