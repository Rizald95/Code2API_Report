package com.stackoverflow.api;

import java.security.*;

public class Human9334357 {

  public static void printAvailableCyphers() {
    for (Provider provider : Security.getProviders()) {
      System.out.println(provider.getName());
      for (String key : provider.stringPropertyNames()) System.out.println(
        "\t" + key + "\t" + provider.getProperty(key)
      );
    }
  }
}
