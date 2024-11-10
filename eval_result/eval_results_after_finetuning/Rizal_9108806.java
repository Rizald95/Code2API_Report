Title: How to remove leading and trailing whitespace from the string in Java?
Question: 
                
I want to remove the leading and trailing whitespace from string:

String s = "          Hello World                    ";


I want the result to be like:

s == "Hello world";

    
Answer: 
 s.trim()


see String#trim()

Without any internal method, use regex like 

 s.replaceAll("^\\s+", "").replaceAll("\\s+$", "")


or 

  s.replaceAll("^\\s+|\\s+$", "")


or just use pattern in pure form

    String s="          Hello World                    ";
    Pattern trimmer = Pattern.compile("^\\s+|\\s+$");
    Matcher m = trimmer.matcher(s);
    StringBuffer out = new StringBuffer();
    while(m.find())
        m.appendReplacement(out, "");
    m.appendTail(out);
    System.out.println(out+"!");

    
Code:  s.trim()

Complete the code as a full Java method.

# Answer


You can use the `String` method `trim()` to remove leading and trailing spaces from a string.

Here is the full Java method:

    
String spaceTest()
{
    String s = "          Hello World                    ";
    s = s.trim();
    System.out.println(s);
    return s;
}


You can run the method like this:

    
spaceTest();


This will print:

Hello World
    
You can also go through the Java API here: String.trim()
    
Hope it helps.
    
Cheers!
    

Complete the