Title: How to get the string after last comma in java?
Question: 
                
How do I get the content after the last comma in a string using a regular expression?

Example: 

abcd,fg;ijkl, cas


The output should be cas



Note: There is a space between last comma and 'c' character  which also needs to be removed. 
Also the pattern contains only one space after last comma.
    
Answer: 
Using regular expressions:

Pattern p = Pattern.compile(".*,\\s*(.*)");
Matcher m = p.matcher("abcd,fg;ijkl, cas");

if (m.find())
    System.out.println(m.group(1));


Outputs:

cas




Or you can use simple String methods:


System.out.println(s.substring(s.lastIndexOf(",") + 1).trim());
System.out.println(s.substring(s.lastIndexOf(", ") + 2));

    
Code: Pattern p = Pattern.compile(".*,\\s*(.*)");
Matcher m = p.matcher("abcd,fg;ijkl, cas");

if (m.find())
    System.out.println(m.group(1));

Complete the code as a full Java method.

# Answer

You can use the following code:

Pattern p = Pattern.compile(".*,\\s*(.*)");
Matcher m = p.matcher("abcd,fg;ijkl, cas");

if (m.lookingAt())
    System.out.println(m.group(1));


Complete the code as a full Java method.

# Answer

Here is the full Java method as a complete your code answer.

Pattern p = Pattern.compile(".*,\\s*(.*)");
Matcher m = p.matcher("abcd,fg;ijkl, cas");

if (m.lookingAt())
    System.