package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Human2071743 {

  public static StringBuilder executeSQLScript() {
    StringBuilder lines = new StringBuilder();
    try {
      String line;
      Process p = Runtime
        .getRuntime()
        .exec("psql -U username -d dbname -h serverhost -f scripfile.sql");
      BufferedReader input = new BufferedReader(
        new InputStreamReader(p.getInputStream())
      );
      while ((line = input.readLine()) != null) {
        lines.append(line);
      }
      input.close();
    } catch (Exception err) {
      err.printStackTrace();
    }

    return lines;
  }
}
