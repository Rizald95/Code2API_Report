package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Human9464552 {

  public static String extractPhoneNumber(String str) {
    Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
    Matcher matcher = pattern.matcher(str);
    if (matcher.find()) {
      return matcher.group(0);
    }
    return null;
  }
}
