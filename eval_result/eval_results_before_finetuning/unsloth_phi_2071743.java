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

Here's a complete Java method that executes an SQL script file using the `Runtime.exec()` method to run the `psql` command-line utility, which is commonly used to interact with PostgreSQL databases. This method assumes that you have the necessary permissions to execute the script and that the `psql` utility is available in your system's PATH.

```java
import java.io.*;

public class CmdExec {

    public static void executeSqlScript(String username, String dbname, String serverhost, String scriptPath) throws IOException {
        // Construct the psql command with the necessary arguments
        String psqlCommand = "psql -U " +