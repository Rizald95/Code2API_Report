
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import com.sun.management.UnixOperatingSystemMXBean;

public class OpenFileCount{
    public static int getOpenFileDescriptorCount(){
        OperatingSystemMXBean os = ManagementFactory.getOperatingSystemMXBean();
        if(os instanceof UnixOperatingSystemMXBean){
            return ((UnixOperatingSystemMXBean) os).getOpenFileDescriptorCount();
        }
        return -1;
    }
}
