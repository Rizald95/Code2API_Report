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

```
public static String removeLeadingAndTrailingWhitespace(String s) {
    return s.trim();
}
```


Explanation:

The `trim()` method is a built-in method in Java that removes leading and trailing whitespace from a string. It is a simple and efficient solution for this problem.

The other methods using regex or pattern are more complex and less efficient than the built-in `trim()` method. They are useful when the problem requires more advanced string manipulation or when the built-in method is not available.

The pattern-based solution is a more flexible and reusable approach, but it is more