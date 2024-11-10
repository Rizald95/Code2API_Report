package com.chatgpt.api;
import java.io.*;
import java.util.Scanner;

public class Chatgpt13370154 {
    public static void readFileCharByChar(String filePath) throws IOException {
        Scanner s = null;
        try {
            s = new Scanner(new BufferedReader(new FileReader(filePath)));
            while (s.hasNext()) {
                String str = s.next();
                char[] myChar = str.toCharArray();
                // do something
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}
