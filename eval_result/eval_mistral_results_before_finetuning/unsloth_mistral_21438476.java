Title: How to read char from standard input in Java
Question: 
                
I have to read char(one at a time) from the standard input in Java.The input will consist of numerous lines (each of about 10000 chars). I do not need to store the chars , they are processed when read.Also I need to skip the newline char .Can someone suggest me an efficient way to do this ?
    
Answer: 
Perhaps something like this will work:

import java.io.IOException;

public class Tester
{
    public static void main(String args[])
        throws IOException
    {
        int ch;
        while ((ch = System.in.read()) != -1)
        {
            if (ch != '\n' && ch != '\r')
            {
                processChar((char)ch);
            }
        }
    }


    private static void processChar(char c)
    {
        // do stuff
        System.out.println("Processing: '" + c + "'");
    }

}

    
Code: import java.io.IOException;

public class Tester
{
    public static void main(String args[])
        throws IOException
    {
        int ch;
        while ((ch = System.in.read()) != -1)
        {
            if (ch != '\n' && ch != '\r')
            {
                processChar((char)ch);
            }
        }
    }


    private static void processChar(char c)
    {
        // do stuff
        System.out.println("Processing: '" + c + "'");
    }

}

Complete the code as a full Java method.

```
import java.io.IOException;

public class Tester {
    public static void main(String[] args) throws IOException {
        int ch;
        while ((ch = System.in.read()) != -1) {
            if (ch != '\n' && ch != '\r') {
                processChar((char)ch);
            }
        }
    }

    private static void processChar(char c) {
        // do stuff
        System.out.println("Processing: '" + c + "'");
    }
}
```

This code reads characters from the standard input one by one, skips newline