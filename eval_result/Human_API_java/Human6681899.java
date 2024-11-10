package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Human6681899 {

  // not very optimal from a complexity point of view
  public static Object[] removeElementFromArray(Object[] array, int index) {
    List<Object> list = new ArrayList<>(Arrays.asList(array));
    list.remove(index);
    return list.toArray();
  }
}
