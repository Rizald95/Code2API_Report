package com.chatgpt.api;
import java.io.*;

public class Chatgpt36110491 {
    public static String getSpecificDataElement(String filePath, String nameToSearch) throws Exception {
        FileReader reader = new FileReader(filePath);
        BufferedReader buffer= new BufferedReader(reader);

        String line = null;
        String names = "";

        while ((line = buffer.readLine()) != null) {
            names += line + '\n';
        }
        buffer.close();

        int i = 0;
        int find, start, end;
        while ((find = names.indexOf("name:", i)) != -1) {
            start = find + 5;
            end = names.indexOf("\t", start);
            String name = names.substring(start, end);
            if (name.equals(nameToSearch)) {
                return name;
            }
            i = end + 1;
        }

        throw new Exception("Name not found");
    }
}
