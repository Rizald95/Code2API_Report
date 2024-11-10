package com.chatgpt.api;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chatgpt2071743 {
    public static void executeSqlScriptFile(String username, String dbname, String serverhost, String scriptfile) throws Exception {
        String line;
        Process p = Runtime.getRuntime().exec("psql -U " + username + " -d " + dbname + " -h " + serverhost + " -f " + scriptfile);
        BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
        while ((line = input.readLine()) != null) {
            System.out.println(line);
        }
        input.close();
    }
}
