Title: How to execute cmd commands via Java
Question: 
                
I am trying to execute command line arguments via Java. For example:

// Execute command
String command = "cmd /c start cmd.exe";
Process child = Runtime.getRuntime().exec(command);

// Get output stream to write from it
OutputStream out = child.getOutputStream();

out.write("cd C:/ /r/n".getBytes());
out.flush();
out.write("dir /r/n".getBytes());
out.close();


The above opens the command line but does not execute cd or dir. Any ideas? I am running Windows XP, JRE6.

(I have revised my question to be more specific. The following answers were helpful but do not answer my question.)
    
Answer: 
The code you posted starts three different processes each with it's own command. To open a command prompt and then run a command try the following (never tried it myself):

try {
    // Execute command
    String command = "cmd /c start cmd.exe";
    Process child = Runtime.getRuntime().exec(command);

    // Get output stream to write from it
    OutputStream out = child.getOutputStream();

    out.write("cd C:/ /r/n".getBytes());
    out.flush();
    out.write("dir /r/n".getBytes());
    out.close();
} catch (IOException e) {
}

    
Code: try {
    // Execute command
    String command = "cmd /c start cmd.exe";
    Process child = Runtime.getRuntime().exec(command);

    // Get output stream to write from it
    OutputStream out = child.getOutputStream();

    out.write("cd C:/ /r/n".getBytes());
    out.flush();
    out.write("dir /r/n".getBytes());
    out.close();
} catch (IOException e) {
}

Complete the code as a full Java method.

```
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        executeCommand();
    }

    public static void executeCommand() {
        try {
            // Execute command
            String command = "cmd /c start cmd.exe";
            Process child = Runtime.getRuntime().exec(command);

            // Get output stream to write from it
            OutputStream out = child.getOutputStream();

            out.write("cd C:/ /r/n".getBytes());
            out.flush();
            out.write("dir /r/n".getBytes());
