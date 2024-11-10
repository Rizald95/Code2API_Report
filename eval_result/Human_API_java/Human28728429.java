package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Human28728429 {

  public static void splitPatterns(String p, String patternString) {
    Pattern pattern = Pattern.compile(p);
    Matcher matcher = pattern.matcher(patternString);

    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
