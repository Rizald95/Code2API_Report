package com.chatgpt.api;
import java.util.Scanner;

public class Chatgpt17691245 {
    public static void readEmployeeDetails() {
        Scanner scanner = new Scanner(System.in);
        int employeeId, supervisorId;
        String name;
        System.out.println("Enter employee ID:");
        employeeId = scanner.nextInt();
        scanner.nextLine(); //This is needed to pick up the new line
        System.out.println("Enter employee name:");
        name = scanner.nextLine();
        System.out.println("Enter supervisor ID:");
        supervisorId = scanner.nextInt();
    }
}