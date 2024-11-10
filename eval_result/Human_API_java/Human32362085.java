package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Human32362085 {

  public static boolean timeInString(String str1) {
    String string = str1;
    System.out.println(String.format("Is there a time in here:(%1$s)", string));
    Pattern p = Pattern.compile(".*([01]?[0-9]|2[0-3]):[0-5][0-9].*");
    Matcher m = p.matcher(string);
    if (m.matches()) {
      return true;
    } else {
      return false;
    }
  }
}
