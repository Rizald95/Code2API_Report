Title: How to find out number of files currently open by Java application?
Question: 
                
Suppose a lot of what your application does deals with reading contents of files. It goes without saying that files that are opened then closed and life is good unless ... new files come in faster then old files get closed. This is the pickle of a situation I found myself in.

Now, is there a way to reliably know how many files are opened by the process? Something that is as reliable as looking at ls /proc/my_pid/fd | wc -l from inside the JVM?

I suspect the answer may be OS-specific, so let me add that I am running Java on Linux.
    
Answer: 
On Unix, one way is using the ManagementFactory to get the OperatingSystemMxBean and if it is a UnixOperatingSystemMXBean, you can use the getOpenFileDescriptorCount() method.

Example code:

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import com.sun.management.UnixOperatingSystemMXBean;

public class OpenFileCount{
    public static void main(String[] args){
        OperatingSystemMXBean os = ManagementFactory.getOperatingSystemMXBean();
        if(os instanceof UnixOperatingSystemMXBean){
            System.out.println("Number of open fd: " + ((UnixOperatingSystemMXBean) os).getOpenFileDescriptorCount());
        }
    }
}

    
Code: import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import com.sun.management.UnixOperatingSystemMXBean;

public class OpenFileCount{
    public static void main(String[] args){
        OperatingSystemMXBean os = ManagementFactory.getOperatingSystemMXBean();
        if(os instanceof UnixOperatingSystemMXBean){
            System.out.println("Number of open fd: " + ((UnixOperatingSystemMXBean) os).getOpenFileDescriptorCount());
        }
    }
}

Complete the code as a full Java method.

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import com.sun.management.UnixOperatingSystemMXBean;

public class OpenFileCount {
    public static int getOpenFileCount() {
        OperatingSystemMXBean os = ManagementFactory.getOperatingSystemMXBean();
        if (os instanceof UnixOperatingSystemMXBean) {
            return ((UnixOperatingSystemMXBean) os).getOpenFileDescriptorCount();
        }
        return -1;
    }
}

Now you can use the method in your application to get the number of open files:

