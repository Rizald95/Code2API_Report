package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;

public class Human9276720 {

  public static List<String> splitBySize(String text, int size) {
    List<String> strings = new ArrayList<String>();
    int index = 0;
    while (index < text.length()) {
      strings.add(text.substring(index, Math.min(index + size, text.length())));
      index += size;
    }
    return strings;
  }
}
