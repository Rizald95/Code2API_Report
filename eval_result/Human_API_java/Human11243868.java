package com.stackoverflow.api;

public class Human11243868 {

  public static int[][] populateMatrixWithNumbers(int n) {
    int[][] arr = new int[n][n];
    int inc = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = inc;
        inc++;
      }
    }
    return arr;
  }
}
