package com.stackoverflow.api;

public class Human5223857 {

  public static int getCountOfWordInSentence(String input, String word) {
    int index = input.indexOf(word);
    int count = 0;
    while (index != -1) {
      count++;
      input = input.substring(index + 1);
      index = input.indexOf(word);
    }
    //System.out.println("No of *is* in the input is : " + count);
    return count;
  }
}
