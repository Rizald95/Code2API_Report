package com.stackoverflow.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Human15518922 {

  public static boolean validateURLInJavaUsingRegex(String url) {
    Pattern p = Pattern.compile(
      "(@)?(href=')?(HREF=')?(HREF=\")?(href=\")?(http://)?[a-zA-Z_0-9\\-]+(\\.\\w[a-zA-Z_0-9\\-]+)+(/[#&\\n\\-=?\\+\\%/\\.\\w]+)?"
    );

    Matcher m = p.matcher(url);
    return m.matches();
  }
}
