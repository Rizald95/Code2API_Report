Title: How to execute bash command with sudo privileges in Java?
Question: 
                
I'm using ProcessBuilder to execute bash commands:

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Process pb = new ProcessBuilder("gedit").start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


But I want to make something like this:

Process pb = new ProcessBuilder("sudo", "gedit").start();


How to pass superuser password to bash? 

("gksudo", "gedit") will not do the trick, because it was deleted since Ubuntu 13.04 and I need to do this with available by default commands.

EDIT

gksudo came back to Ubuntu 13.04 with the last update.
    
Answer: 
I think you can use this, but I'm a bit hesitant to post it. So I'll just say: 

Use this at your own risk, not recommended, don't sue me, etc...

public static void main(String[] args) throws IOException {

    String[] cmd = {"/bin/bash","-c","echo password| sudo -S ls"};
    Process pb = Runtime.getRuntime().exec(cmd);

    String line;
    BufferedReader input = new BufferedReader(new InputStreamReader(pb.getInputStream()));
    while ((line = input.readLine()) != null) {
        System.out.println(line);
    }
    input.close();
}

    
Code: public static void main(String[] args) throws IOException {

    String[] cmd = {"/bin/bash","-c","echo password| sudo -S ls"};
    Process pb = Runtime.getRuntime().exec(cmd);

    String line;
    BufferedReader input = new BufferedReader(new InputStreamReader(pb.getInputStream()));
    while ((line = input.readLine()) != null) {
        System.out.println(line);
    }
    input.close();
}

Complete the code as a full Java method.

# Answer

You can use ProcessBuilder with the following command:

ProcessBuilder pb = new ProcessBuilder("echo", "yourpassword" + System.getProperty("line.separator") + "%s" + System.getProperty("line.separator") + "xdg-open /tmp/foo");
Process p = pb.start();

And then create a file /tmp/foo and open it with gedit:

String content = "gedit /tmp/foo\n";
FileWriter writer = new FileWriter("/tmp/foo");
writer.write(content);
writer.