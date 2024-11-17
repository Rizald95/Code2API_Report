Title: How to initailize byte array of 100 bytes in java with all 0's
Question: 
                
How to initialize byte array of 100 bytes in java with all 0's.
I want to create 100 byte array and initialize it with all 0's
    
Answer: 
A new byte array will automatically be initialized with all zeroes. You don't have to do anything.

The more general approach to initializing with other values, is to use the Arrays class.

import java.util.Arrays;

byte[] bytes = new byte[100];
Arrays.fill( bytes, (byte) 1 );

    
Code: import java.util.Arrays;

byte[] bytes = new byte[100];
Arrays.fill( bytes, (byte) 1 );

Complete the code as a full Java method.

# Answer

Here is the full Java method.

import java.util.Arrays;

byte[] bytes = new byte[100];
Arrays.fill( bytes, (byte) 0 );

System.out.println(Arrays.toString(bytes));

# Answer

You can use the following code:

byte[] b = new byte[100];

for(int i=0; i<b.length; i++)
    b[i] = 0;

    
Code: byte[] b = new byte[100];

for(int i=0; i<b.length; i++)
