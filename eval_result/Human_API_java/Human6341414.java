package com.stackoverflow.api;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Human6341414 {

  public static boolean isStringRegex(String input) {
    //https://stackoverflow.com/a/6341414
    boolean isRegex;
    try {
      Pattern.compile(input);
      isRegex = true;
      return isRegex;
    } catch (PatternSyntaxException e) {
      isRegex = false;
      return isRegex;
    }
  }
}
