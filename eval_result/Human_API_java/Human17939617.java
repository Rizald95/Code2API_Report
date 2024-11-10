package com.stackoverflow.api;

import java.lang.*;
import java.util.*;

public class Human17939617 {

  public static String getExecutionDirPath() {
    try {
      String dir = System.getProperty("user.dir");
      // System.out.print("Executing at =>" + dir.replace("\\", "/"));

      return dir;
    } catch (Exception e) {
      System.out.println("Exception caught =" + e.getMessage());
    }

    return null;
  }
}
