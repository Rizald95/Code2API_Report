package com.chatgpt.api;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Chatgpt18119273 {
    public static void checkIfInputIsNotInt() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Please input an integer");
            int usrInput = sc.nextInt();
        } catch (InputMismatchException exception) {
            throw new InputMismatchException("This is not an integer");
        }
    }
}
