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

Answer:
Here's a complete Java method that encapsulates the logic you're trying to achieve:

```java
import java.io.IOException;
import java.io.OutputStream;

public class ExecuteCmd {

    public static void main(String[] args) {
        try {
            // Execute command
            String command = "cmd /c start cmd.exe";
            Process child = Runtime.getRuntime().exec(command);

            // Get output stream to write from it
            OutputStream out = child.getOutputStream();

            // Write commands to the command prompt
            out.write("cd C:/ /r/n