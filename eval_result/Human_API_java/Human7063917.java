package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;

public class Human7063917 {

  public static CharSequence[] getCharSequence(String... items) {
    List<String> listItems = new ArrayList<>();
    for (String item : items) {
      listItems.add(item);
    }

    return listItems.toArray(new CharSequence[listItems.size()]);
  }
}
