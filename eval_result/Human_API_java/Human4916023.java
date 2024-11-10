package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Human4916023 {

  public static void MatchPattern(String line, String patternElements) {
    Pattern p = Pattern.compile(patternElements);
    Matcher matcher = p.matcher(line);
    while (matcher.find()) {
      System.out.printf("group: %s%n", matcher.group());
    }
    System.out.println("done");
  }
}
