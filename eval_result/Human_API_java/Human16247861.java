package com.stackoverflow.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Human16247861 {

  public static LinkedList readFileIntoLinkedList(File file) {
    String content = new String();
    int count = 1;
    LinkedList<String> list = new LinkedList<>();

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
    Iterator i = list.iterator();
    while (i.hasNext()) {
      System.out.print("Node " + (count++) + " : ");
      System.out.println(i.next());
    }
    return list;
  }
}
