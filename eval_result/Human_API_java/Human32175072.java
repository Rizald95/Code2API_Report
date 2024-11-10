package com.stackoverflow.api;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Human32175072 {

  public static void base64toPDF(byte[] decodedBytes, String str1) {
    try (OutputStream out = new FileOutputStream(str1)) {
      out.write(decodedBytes);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
