package com.stackoverflow.api;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Human31807319 {

  public static void createSymlink(Path directoryLink, Path directoryTarget) {
    Files.exists(directoryTarget);

    try {
      Files.createSymbolicLink(directoryLink, directoryTarget);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
