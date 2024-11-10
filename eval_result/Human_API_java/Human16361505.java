package com.stackoverflow.api;

import com.sun.management.UnixOperatingSystemMXBean;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

public class Human16361505 {

  public static int numberOfOpenFileDescriptor() {
    OperatingSystemMXBean os = ManagementFactory.getOperatingSystemMXBean();
    if (os instanceof UnixOperatingSystemMXBean) {
      return ((UnixOperatingSystemMXBean) os).getOpenFileDescriptorCount();
    }
    return -1;
  }
}
