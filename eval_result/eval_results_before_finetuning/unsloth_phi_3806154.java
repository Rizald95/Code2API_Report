Title: How to open a txt file and read numbers in Java
Question: 
                
How can I open a .txt file and read numbers separated by enters or spaces into an array list?
    
Answer: 
Read file, parse each line into an integer and store into a list:

List<Integer> list = new ArrayList<Integer>();
File file = new File("file.txt");
BufferedReader reader = null;

try {
    reader = new BufferedReader(new FileReader(file));
    String text = null;

    while ((text = reader.readLine()) != null) {
        list.add(Integer.parseInt(text));
    }
} catch (FileNotFoundException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
} finally {
    try {
        if (reader != null) {
            reader.close();
        }
    } catch (IOException e) {
    }
}

//print out the list
System.out.println(list);

    
Code: List<Integer> list = new ArrayList<Integer>();
File file = new File("file.txt");
BufferedReader reader = null;

try {
    reader = new BufferedReader(new FileReader(file));
    String text = null;

    while ((text = reader.readLine()) != null) {
        list.add(Integer.parseInt(text));
    }
} catch (FileNotFoundException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
} finally {
    try {
        if (reader != null) {
            reader.close();
        }
    } catch (IOException e) {
    }
}

//print out the list
System.out.println(list);

Complete the code as a full Java method.

Here's a complete Java method that opens a text file, reads numbers separated by newlines or spaces, and adds them to an ArrayList:

```java
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadNumbersFromFile {

    public static ArrayList<Integer> readNumbersFromFile(String filePath) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        File file = new File(filePath);
        BufferedReader reader = null;

        try {
            reader = new BufferedReader