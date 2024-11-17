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

You can use the trim() method on the String.

String s = "          Hello World                    ";
s = s.trim();


With this, the spaces before the word 'Hello' and after 'World' will be removed.

DEMO

    
Code: String s = "          Hello World                    ";
s = s.trim();

Complete the code as a full Java method.

# Answer

You can use the trim() method on the String.

String s = "          Hello World                    ";
s = s.trim();


With this, the spaces before the word 'Hello' and after '