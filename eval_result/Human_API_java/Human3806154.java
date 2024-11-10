package com.stackoverflow.api;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Human3806154 {

  public static List<Integer> readIntegersFromFiles(String str1) {
    List<Integer> list = new ArrayList<>();
    File file = new File(str1);
    BufferedReader reader = null;

    try {
      reader = new BufferedReader(new FileReader(file));
      String text = null;

      while ((text = reader.readLine()) != null) {
        list.add(Integer.parseInt(text));
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (reader != null) {
          reader.close();
        }
      } catch (IOException e) {}
    }

    //print out the list
    //        System.out.println(list);
    return list;
  }
}
