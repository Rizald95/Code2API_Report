package com.stackoverflow.api;

public class Human9515546 {

  public static void printContentAfterLastComma(String pText) {
    Pattern p = Pattern.compile(".*,\\s*(.*)");
    Matcher m = p.matcher(pText);

    if (m.find()) System.out.println(m.group(1));
  }
}
