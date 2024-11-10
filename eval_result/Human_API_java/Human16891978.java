package com.stackoverflow.api;

import java.io.*;

public class Human16891978 {

  public static void copyFile(String srcFilePath, String str1)
    throws IOException {
    File f = new File(srcFilePath);

    OutputStream oos = new FileOutputStream(str1);

    byte[] buf = new byte[8192];

    InputStream is = new FileInputStream(f);

    int c = 0;

    while ((c = is.read(buf, 0, buf.length)) > 0) {
      oos.write(buf, 0, c);
      oos.flush();
    }

    oos.close();
    System.out.println("stop");
    is.close();
  }
}
