package com.stackoverflow.api;

public class Human19066796 {

  /**
   * Get lower case vowels from string
   * @param str Input string
   * @return Array of vowels
   */
  public static char[] getVowelsFromString(String str) {
    char[] vowels = new char[str.length()];

    for (int i = 0; i < str.length(); i++) {
      if (
        (str.charAt(i) == 'a') ||
        (str.charAt(i) == 'e') ||
        (str.charAt(i) == 'i') ||
        (str.charAt(i) == 'o') ||
        (str.charAt(i) == 'u')
      ) {
        vowels[vowels.length + 1] = str.charAt(i);
      }
    }

    return vowels;
  }
}
