package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Human19751994 {

  public static List<String> getGroupsFromString(String regex, String line) {
    Matcher matcher = Pattern.compile(regex).matcher(line);

    List<String> tags = new ArrayList<>();

    int pos = -1;
    while (matcher.find(pos + 1)) {
      pos = matcher.start();
      tags.add(matcher.group(1));
    }

    return tags;
  }
}
