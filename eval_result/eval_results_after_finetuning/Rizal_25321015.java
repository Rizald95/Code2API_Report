Title: How to launch chrome browser from java
Question: 
                
Is there any smart way to launch the chrome browser from a java class? I'm asking because I would like a smart way to launch an application that required a chrome browser on a machine that has internet explorer as a default browser and java 1.4.2 installed.

thanks
    
Answer: 
You can execute chrome.exe like this:

try {
    Process p = Runtime.getRuntime().exec("\"/Program Files (x86)/Google/Chrome/Application/chrome.exe\"");
    p.waitFor();
    System.out.println("Google Chrome launched!");
} catch (Exception e) {
    e.printStackTrace();
}


Provided you know where Chrome is installed.
    
Code: try {
    Process p = Runtime.getRuntime().exec("\"/Program Files (x86)/Google/Chrome/Application/chrome.exe\"");
    p.waitFor();
    System.out.println("Google Chrome launched!");
} catch (Exception e) {
    e.printStackTrace();
}

Complete the code as a full Java method.

# Answer

You can try the following method:

    public static void launchChrome() {
        try {
            Process p = Runtime.getRuntime().exec("\"C:/Program Files (x86)/Google/Chrome/Application/chrome.exe\"");
            p.waitFor();
            System.out.println("Google Chrome launched!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

Or you can use forward slashes instead of backward slashes as the separator:

    public static void launchChrome() {
        try {
            Process p = Runtime.getRuntime().exec("C:/