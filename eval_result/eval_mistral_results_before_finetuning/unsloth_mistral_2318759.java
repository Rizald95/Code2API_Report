Title: How to detect via Java whether a particular process is running under Windows?
Question: 
                
Well the title pretty much sums the question. The only thing I found is this
but I'm not sure if thats the way to go.
    
Answer: 
You can use the wmic utility to check the list of running processes.
Suppose you want to check if the windows' explorer.exe process is running :
String line;
try {
    Process proc = Runtime.getRuntime().exec("wmic.exe");
    BufferedReader input = new BufferedReader(new InputStreamReader(proc.getInputStream()));
    OutputStreamWriter oStream = new OutputStreamWriter(proc.getOutputStream());
    oStream .write("process where name='explorer.exe'");
    oStream .flush();
    oStream .close();
    while ((line = input.readLine()) != null) {
        System.out.println(line);
    }
    input.close();
} catch (IOException ioe) {
    ioe.printStackTrace();
}

See http://ss64.com/nt/wmic.html or http://support.microsoft.com/servicedesks/webcasts/wc072402/listofsampleusage.asp for some example of what you can get from wmic...
2022 update
As you can see in the link above, wmic was deprecated in Windows 10. The good news is that now the ps command works on windows 10 under powershell, so you can get your "cross-platform" support with something like this (untested):
public class ProcessInfo {

    static boolean isProcessRunning(String processName) {
        String[] command = new String[]{ "powershell", "ps", processName };
        try {
            if (System.getProperty("os.name").toLowerCase().contains("linux")) {
                command = new String[]{ "ps", "-o", "comm" };
            }
            Process ps = new ProcessBuilder(command).start();
            return new BufferedReader(
                    new InputStreamReader(ps.getInputStream(), StandardCharsets.UTF_8)
            ).lines().anyMatch(line -> line.equalsIgnoreCase(processName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

You can use it like this:
```
boolean isExplorerRunning = ProcessInfo.isProcessRunning("explorer.exe");
```