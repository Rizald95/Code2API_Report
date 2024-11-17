Title: How to adjust trailing whitespace?
Question: 
                
I am writing to a file in java but the strings that are input into the file are different, how do i adjust the trailing whitespace depending on the length of the string.

for example

First Name     Last Name     Address
----------     ---------     -------
Michael        Jordan        23 E. Jump Street
Larry          Bird          33 North Celtics Run

    
Answer: 
You can use String.format():

System.out.println(String.format("[%-20s]", "foo"));


will give you:

[foo                 ]

    
Code: System.out.println(String.format("[%-20s]", "foo"));

Complete the code as a full Java method.

# Answer

You can use String.format():

System.out.println(String.format("[%-20s]", "foo"));


will give you:

[foo                 ]

    
Code: System.out.println(String.format("[%-20s]", "foo"));

Complete the code as a full Java method.

# Answer

You can use String.format():

System.out.println(String.format("[%-20s]", "foo"));


will give you:

[foo                 ]

    
Code: System.out.println(String.format("[%-20