package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Human2367418 {

  public static List<String> extractNumbersFromString(final String s) {
    List<String> numbers = new ArrayList<>();
    Pattern p = Pattern.compile("-?\\d+");
    Matcher m = p.matcher(s);
    while (m.find()) {
      System.out.println(m.group());
      numbers.add(m.group());
    }
    return numbers;
  }
}
