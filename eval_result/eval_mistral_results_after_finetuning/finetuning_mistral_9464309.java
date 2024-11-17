Title: How to find the exact word using a regex in Java?
Question: 
                
Consider the following code snippet:

String input = "Print this";
System.out.println(input.matches("\\bthis\\b"));


Output

false


What could be possibly wrong with this approach? If it is wrong, then what is the right solution to find the exact word match? 

PS: I have found a variety of similar questions here but none of them provide the solution I am looking for.
Thanks in advance.
    
Answer: 
When you use the matches() method, it is trying to match the entire input. In your example, the input "Print this" doesn't match the pattern because the word "Print" isn't matched.

So you need to add something to the regex to match the initial part of the string, e.g.

.*\\bthis\\b


And if you want to allow extra text at the end of the line too:

.*\\bthis\\b.*


Alternatively, use a Matcher object and use Matcher.find() to find matches within the input string:

    Pattern p = Pattern.compile("\\bthis\\b");
    Matcher m = p.matcher("Print this");
    m.find();
    System.out.println(m.group());


Output:

this


If you want to find multiple matches in a line, you can call find() and group() repeatedly to extract them all.
    
Code: .*\\bthis\\b

Complete the code as a full Java method.

# Answer

You can use the POSIX character classes (see here):

Pattern p = Pattern.compile("\\bthis\\b");
Matcher m = p.matcher("Print this");
m.lookingAt();
System.out.println(m.lookingAt());


With this code as a full Java method, the output will be:

true


# Answer

You can use POSIX character classes (see here):

Pattern p = Pattern.compile("\\bthis\\b");
Matcher m = p.matcher("Print this");
m.lookingAt();
System.out.println(m.lookingAt());

