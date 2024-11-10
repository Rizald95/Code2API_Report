package com.stackoverflow.api;

public class Human15150223 {

  public static boolean stringMatchesCharactersExclusively(
    String s,
    String characters
  ) {
    //https://stackoverflow.com/a/15150223
    if (!s.matches("[" + characters + "]+")) {
      System.out.println(
        "The string you entered has some incorrect characters"
      );
      return false;
    }

    return true;
  }
}
