Title: How to save the data into File in java?
Question: 
                
I have one problem, that is I have one string of data and I want to save it into a separate file every time. Please give me a suggestion.

Thanks,
vara kumar.pjd 
    
Answer: 
Use a timestamp in the filename so you can be sure it is unique. Below example uses a timestamp in milliseconds which should be enough in most cases.
If you expect you can have multiple files within 1 millisecond then you could do something with a GUID/UUID. Note that GUID/UUID could result in duplicates too, however this chance is extremely rare.
import java.io.*;
class FileWrite 
{
   public static void main(String args[])
  {
      try{
    // Create file 
    FileWriter fstream = new FileWriter(System.currentTimeMillis() + "out.txt");
        BufferedWriter out = new BufferedWriter(fstream);
    out.write("Hello Java");
    //Close the output stream
    out.close();
    }catch (Exception e){//Catch exception if any
      System.err.println("Error: " + e.getMessage());
    }
  }
}

    
Code: import java.io.*;
class FileWrite 
{
   public static void main(String args[])
  {
      try{
    // Create file 
    FileWriter fstream = new FileWriter(System.currentTimeMillis() + "out.txt");
        BufferedWriter out = new BufferedWriter(fstream);
    out.write("Hello Java");
    //Close the output stream
    out.close();
    }catch (Exception e){//Catch exception if any
      System.err.println("Error: " + e.getMessage());
    }
  }
}

Complete the code as a full Java method.

import java.io.*;

public class FileSaver {

    public static void saveDataToFile(String data) {
        try {
            // Create a timestamp
            long timestamp = System.currentTimeMillis();
            String filename = "data_" + timestamp + ".txt";

            // Create a file with the timestamp in its name
            FileWriter fstream = new FileWriter(filename);
            BufferedWriter out = new BufferedWriter(fstream);

            // Write the data to the file
            out.write(data);

            // Close the output stream
            out.close();

            System.out.println("Data saved to file