Title: How to read an input file char by char using a Scanner?
Question: 
                
I have to use Scanner, so is there a nextChar() instead of nextLine() method that I could use?

Thanks!
    
Answer: 
You can convert in an array of chars.   

import java.io.*;
import java.util.Scanner;


public class ScanXan {
    public static void main(String[] args) throws IOException {
        Scanner s = null;
        try {
            s = new Scanner(new BufferedReader(new FileReader("yourFile.txt")));
            while (s.hasNext())
            {
               String str = s.next(); 
                char[] myChar = str.toCharArray();
                // do something
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }

    
Code: import java.io.*;
import java.util.Scanner;


public class ScanXan {
    public static void main(String[] args) throws IOException {
        Scanner s = null;
        try {
            s = new Scanner(new BufferedReader(new FileReader("yourFile.txt")));
            while (s.hasNext())
            {
               String str = s.next(); 
                char[] myChar = str.toCharArray();
                // do something
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }

Complete the code as a full Java method.


Here's a complete Java method that reads a file character by character using a Scanner:

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharByCharFileReader {

    public static void readFileCharByChar(String filePath) {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(filePath)))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                for (char ch : line.toCharArray()) {
                