package com.chatgpt.api;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import com.sun.management.UnixOperatingSystemMXBean;

public class Chatgpt16361505 {
    public static long getOpenFileCount() {
        OperatingSystemMXBean os = ManagementFactory.getOperatingSystemMXBean();
        if(os instanceof UnixOperatingSystemMXBean){
            return ((UnixOperatingSystemMXBean) os).getOpenFileDescriptorCount();
        }
        return -1;
    }
}
