package com.chatgpt.api;
import java.io.IOException;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;

public class Chatgpt31807319 {
    public static void executeSymlinkCommand(String sourceFilename, String destinationFilename) throws IOException {
        String command = "ln -sf " + "/home/Desktop/\"" + sourceFilename + "\"" + " /home/Desktop/Folder/\"" + destinationFilename + "\"";
        CommandLine oCmdLine = CommandLine.parse(command);
        DefaultExecutor oDefaultExecutor = new DefaultExecutor();
        oDefaultExecutor.setExitValue(0);
        try {
            oDefaultExecutor.execute(oCmdLine);
        } catch (ExecuteException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
