package com.stackoverflow.api;

import java.io.IOException;
import java.io.OutputStream;

public class Human4157429 {

  public static void executeCommandsOnCMD() {
    try {
      // Execute command
      String command = "cmd /c start cmd.exe";
      Process child = Runtime.getRuntime().exec(command);

      // Get output stream to write from it
      OutputStream out = child.getOutputStream();

      out.write("cd C:/ /r/n".getBytes());
      out.flush();
      out.write("dir /r/n".getBytes());
      out.close();
    } catch (IOException e) {}
  }
}
