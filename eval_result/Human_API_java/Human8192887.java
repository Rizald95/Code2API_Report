package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;

public class Human8192887 {

  public static List<String> search(List<String> list, String term) {
    List<String> listClone = new ArrayList<>();
    for (String string : list) {
      if (string.matches("(?i)(" + term + ").*")) {
        listClone.add(string);
      }
    }
    System.out.println(listClone);
    return listClone;
  }
}
