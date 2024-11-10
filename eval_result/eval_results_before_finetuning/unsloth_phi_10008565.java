Title: How to get operating system in Java
Question: 
                
I know there is such a question on SO, but I could not find it. So asking again...

I need to set up properties to my program, but I need to make it OS indipendent - running both on Windows XP and Linux (unknown distro, unknown version)

More specifically - I need to set up to the system where to find the chromedriver binary. I need something like this pseudocode:

 if (getOs() == Windows){
    System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "chromedriver.exe");
   } else{
     System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "chromedriver");
   }


Now I need the part for getting the OS. Thanks for help.
    
Answer: 
System.getProperty("os.name");
System.getProperty("os.version");
System.getProperty("os.arch");

    
Code: System.getProperty("os.name");
System.getProperty("os.version");
System.getProperty("os.arch");

Complete the code as a full Java method.


Here's a complete Java method that checks the operating system and sets the path to the ChromeDriver executable accordingly:

```java
import org.openqa.selenium.remote.DesiredCapabilities;
import org0.selenium.remote.ChromeDriverService;

public class OSIndependentChromeDriver {

    public static void main(String[] args) {
        String osName = System.getProperty("os.name").toLowerCase();
        String osVersion = System.getProperty("os.version");
        String osArch = System.getProperty("os.arch").toLowerCase();

        String chromeDriverPath;

        if