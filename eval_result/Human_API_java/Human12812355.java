package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Human12812355 {

  public static String[] removeItemFromStringArray(
    String[] str_array,
    String item
  ) {
    List<String> list = new ArrayList<String>(Arrays.asList(str_array));
    list.remove(item);
    str_array = list.toArray(new String[0]);
    return str_array;
  }
}
