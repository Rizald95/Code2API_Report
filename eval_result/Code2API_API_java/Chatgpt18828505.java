package com.chatgpt.api;
public class Chatgpt18828505 {
    public static int getMinMaxValue(int[] convertedValues) {
        int max = convertedValues[0];

        for (int i = 1; i < convertedValues.length; i++) {
            if (convertedValues[i] > max) {
                max = convertedValues[i];
            }
        }

        return max;
    }
}
