package com.stackoverflow.api;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Human10039728 {

  public static byte[] readFileInByte(String path) throws IOException {
    File file = new File(path);
    int size = (int) file.length();
    byte[] bytes = new byte[size];
    BufferedInputStream buf = new BufferedInputStream(
      new FileInputStream(file)
    );
    buf.read(bytes, 0, bytes.length);
    buf.close();

    return bytes;
  }
}
