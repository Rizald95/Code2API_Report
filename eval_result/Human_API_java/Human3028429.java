package com.stackoverflow.api;

import java.math.BigInteger;
import java.util.Scanner;

public class Human3028429 {

  public static String convertStringToBigInteger() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the message");
    String msg = sc.next();
    BigInteger bi = new BigInteger(msg.getBytes());
    return new String(bi.toByteArray());
  }
}
