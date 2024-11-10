package com.stackoverflow.api;

public class Human9464309 {

  public static boolean hasWord(String pWord, String pText) {
    Pattern p = Pattern.compile("\\b+pWord+\\b");
    Matcher m = p.matcher(pText);

    m.find();
    System.out.println(m.group());

    return m.group();
  }
}
