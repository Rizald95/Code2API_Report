package com.stackoverflow.api;

import java.io.RandomAccessFile;

public class Human2605884 {

  public static void openWindowsNamedPipe() {
    try {
      // Connect to the pipe
      RandomAccessFile pipe = new RandomAccessFile(
        "\\\\.\\pipe\\testpipe",
        "rw"
      );
      String echoText = "Hello word\n";
      // write to pipe
      pipe.write(echoText.getBytes());
      // read response
      String echoResponse = pipe.readLine();
      System.out.println("Response: " + echoResponse);
      pipe.close();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
