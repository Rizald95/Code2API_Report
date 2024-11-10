package com.chatgpt.api;
import java.util.*;
import java.io.*;

public class Chatgpt16247861 {
    public static void readAndSaveFileContentToList(String fileName) throws IOException {
        String content = new String();
        int count = 1;
        File file = new File(fileName);
        LinkedList<String> list = new LinkedList<String>();

        try {
            Scanner sc = new Scanner(new FileInputStream(file));
            while (sc.hasNextLine()) {
                content = sc.nextLine();
                list.add(content);
            }
            sc.close();
        } catch (FileNotFoundException fnf) {
            fnf.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\nProgram terminated Safely...");
        }

        Collections.reverse(list);
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            System.out.print("Node " + (count++) + " : ");
            System.out.println(i.next());
        }
    }
}
