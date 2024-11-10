package com.chatgpt.api;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chatgpt11009861 {
    public static List<Integer> getListOfIntegers(String number) {
        Scanner scanner = new Scanner(number);
        List<Integer> list = new ArrayList<Integer>();
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }
        return list;
    }
}
