package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Human1473198 {

  public static void printDataBetweenQuotes(String line) {
    Pattern p = Pattern.compile("\"([^\"]*)\"");
    Matcher m = p.matcher(line);
    while (m.find()) {
      System.out.println(m.group(1));
    }
  }
}
