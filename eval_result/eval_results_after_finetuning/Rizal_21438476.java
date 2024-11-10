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

Updates:

1. I am using System.in as the source of char.

2. The method I am looking for should not return anything and it throws IOException in case of any error.

3. The method I am looking for should accept char one by one and process it.

4. After processing each char, method should immediately get the next char and process it and so on...

5. A newline char ('\n') and carriage return char ('\r') should be skipped and next char should be read and processed.

6. No other else char should be skipped.

7. No char should be read if both carriage return and newline are read