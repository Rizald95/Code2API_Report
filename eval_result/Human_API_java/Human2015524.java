package com.stackoverflow.api;

public class Human2015524 {

  public static MemoryInfo getMemoryInfo() {
    // Get current size of heap in bytes
    long heapSize = Runtime.getRuntime().totalMemory();

    // Get maximum size of heap in bytes. The heap cannot grow beyond this size.// Any attempt will result in an OutOfMemoryException.
    long heapMaxSize = Runtime.getRuntime().maxMemory();

    // Get amount of free memory within the heap in bytes. This size will increase // after garbage collection and decrease as new objects are created.
    long heapFreeSize = Runtime.getRuntime().freeMemory();

    return new MemoryInfo(heapSize, heapMaxSize, heapFreeSize);
  }
}

class MemoryInfo {

  private long heapSize;
  private long heapMaxSize;
  private long heapFreeSize;

  public MemoryInfo(long heapSize, long heapMaxSize, long heapFreeSize) {
    this.heapSize = heapSize;
    this.heapMaxSize = heapMaxSize;
    this.heapFreeSize = heapFreeSize;
  }

  public long getHeapSize() {
    return heapSize;
  }

  public long getHeapMaxSize() {
    return heapMaxSize;
  }

  public long getHeapFreeSize() {
    return heapFreeSize;
  }
}
