package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Human16817458 {

  public static boolean isStringValid(String line) {
    Pattern p = Pattern.compile("\\G(\\w+)=(\\w+);");
    Matcher m = p.matcher(line);
    int lastMatchPos = 0;
    while (m.find()) {
      System.out.println(m.group(1));
      System.out.println(m.group(2));
      lastMatchPos = m.end();
    }
    if (lastMatchPos != line.length()) return false;
    return true;
  }
}
