package com.chatgpt.api;
import java.util.Scanner;

public class Chatgpt11243868 {
    public static void populate2DArray(int n) {
        int[][] arr = new int[n][n];
        int inc = 1;
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++) 
                arr[i][j] = inc++;
    }
}
