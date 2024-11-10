package com.chatgpt.api;
public class Chatgpt5387398 {
    public static void convertMinutesToHoursAndMinutes(int minutes) {
        int hours = minutes / 60;
        int minutesRemaining = minutes % 60;
        System.out.printf("%d:%02d", hours, minutesRemaining);
    }
}
