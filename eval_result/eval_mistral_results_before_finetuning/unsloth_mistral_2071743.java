Title: How to Execute SQL Script File in Java?
Question: 
                
I want to execute an SQL script file in Java without reading the entire file content into a big query and executing it.

Is there any other standard way?
    
Answer: 
There is no portable way of doing that. You can execute a native client as an external program to do that though:

import java.io.*;
public class CmdExec {

  public static void main(String argv[]) {
    try {
      String line;
      Process p = Runtime.getRuntime().exec
        ("psql -U username -d dbname -h serverhost -f scripfile.sql");
      BufferedReader input =
        new BufferedReader
          (new InputStreamReader(p.getInputStream()));
      while ((line = input.readLine()) != null) {
        System.out.println(line);
      }
      input.close();
    }
    catch (Exception err) {
      err.printStackTrace();
    }
  }
}



Code sample was extracted from here and modified to answer question assuming that the user wants to execute a PostgreSQL script file.

    
Code: import java.io.*;
public class CmdExec {

  public static void main(String argv[]) {
    try {
      String line;
      Process p = Runtime.getRuntime().exec
        ("psql -U username -d dbname -h serverhost -f scripfile.sql");
      BufferedReader input =
        new BufferedReader
          (new InputStreamReader(p.getInputStream()));
      while ((line = input.readLine()) != null) {
        System.out.println(line);
      }
      input.close();
    }
    catch (Exception err) {
      err.printStackTrace();
    }
  }
}

Complete the code as a full Java method.

Code:
```
import java.io.*;

public class ExecuteSQLScript {

    public static void main(String[] args) {
        String scriptFile = "scriptfile.sql";
        String userName = "username";
        String databaseName = "dbname";
        String serverHost = "serverhost";

        try {
            Process p = Runtime.getRuntime().exec(
                String.format("psql -U %s -d %s -h %s -f %s", userName, databaseName, serverHost, scriptFile)
            );

            BufferedReader input = new BufferedReader(
               