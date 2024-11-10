package com.chatgpt.api;
import java.lang.Math;

public class Chatgpt9962492 {
    public static void getNumberPlaceValue(int[] values) {
        for(int i = 0; i < values.length; i++) {
            double tenthPower = Math.floor(Math.log10(values[i]));
            double place = Math.pow(10, tenthPower);
            System.out.println(place);
        }
    }
}
