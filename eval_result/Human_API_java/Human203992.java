package com.stackoverflow.api;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Human203992 {

  public static void removeDuplicatesFromList(List al) {
    Set<String> hs = new HashSet<>();
    hs.addAll(al);
    al.clear();
    al.addAll(hs);
  }
}
