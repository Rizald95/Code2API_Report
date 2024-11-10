package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Human2961537 {

  public static String retrieveSecondWord(String s) {
    //https://stackoverflow.com/a/2961537
    Pattern pattern = Pattern.compile("\\s([A-Za-z]+)");
    Matcher matcher = pattern.matcher(s);
    if (matcher.find()) {
      System.out.println(matcher.group(1));
    }
    return matcher.group(1);
  }
}
