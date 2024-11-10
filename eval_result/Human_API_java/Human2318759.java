package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Human2318759 {

  public static boolean checkProcess(String process) {
    String line;
    try {
      Process proc = Runtime.getRuntime().exec("wmic.exe");
      BufferedReader input = new BufferedReader(
        new InputStreamReader(proc.getInputStream())
      );
      OutputStreamWriter oStream = new OutputStreamWriter(
        proc.getOutputStream()
      );
      oStream.write("process where name='" + process + "'");
      oStream.flush();
      oStream.close();
      while ((line = input.readLine()) != null) {
        if (line.contains(process)) return true;
      }
      input.close();
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
    return false;
  }
}
