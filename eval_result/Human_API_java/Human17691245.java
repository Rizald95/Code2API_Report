package com.stackoverflow.api;

import java.util.Scanner;

public class Human17691245 {

  public static Object[] readStringsfromScanner() {
    Scanner scanner = new Scanner(System.in);
    int eid, sid;
    String ename;
    System.out.println("Enter employee ID:");
    eid = scanner.nextInt();
    scanner.nextLine(); // This is needed to pick up the new line
    System.out.println("Enter employee name:");
    ename = scanner.nextLine();
    System.out.println("Enter supervisor ID:");
    sid = scanner.nextInt();
    scanner.close();
    return new Object[] { employeeId, name, supervisorId };
  }
}
