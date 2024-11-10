package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Human4662265 {

  public static String extractFromSingleQuotes(String mydata) {
    Pattern pattern = Pattern.compile("'(.*?)'");
    Matcher matcher = pattern.matcher(mydata);
    if (matcher.find()) {
      return matcher.group(1);
    }
    return null;
  }
}
