package com.chatgpt.api;
public class Chatgpt24753336 {
    public static int[] splitDoubleByDot(double val) {
        String[] arr=String.valueOf(val).split("\\.");
        int[] intArr=new int[2];
        intArr[0]=Integer.parseInt(arr[0]);
        intArr[1]=Integer.parseInt(arr[1]);
        return intArr;
    }
}
