package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Human6596139 {

  public static boolean isStringAlphanumeric(String s) {
    Pattern p = Pattern.compile("[a-zA-Z0-9]");
    Matcher m = p.matcher(s);
    if (m.find()) System.out.println(
      "The string \"" + s + "\" contains alphanumerical characters."
    );

    return m.find();
  }
}
