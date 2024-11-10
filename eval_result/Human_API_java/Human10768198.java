package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Human10768198 {

  public static List<List<String>> generate2DArrays() {
    List<List<String>> ls2d = new ArrayList<List<String>>();
    List<String> x = new ArrayList<String>();
    x.add("Hello");
    x.add("world!");
    ls2d.add(x);

    System.out.println(Arrays.deepToString(ls2d.toArray()));
    return ls2d;
  }
}
