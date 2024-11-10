package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;

public class Human2707431 {

  public static List<int[]> create2DArray(
    int[] array,
    int[] array1,
    int[] array2
  ) {
    List<int[]> rowList = new ArrayList<>();

    rowList.add(array);
    rowList.add(array1);
    rowList.add(array2);

    return rowList;
  }
}
