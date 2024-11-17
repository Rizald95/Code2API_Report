Title: How to replace a word in a String?
Question: 
                
I'm using a String like:

String message = "%%NAME is inviting you";


I am using message.replaceAll("%%NAME", me); where me is a String. This line of code is not working for me. I was wondering what I was doing wrong?
    
Answer: 
Code looks more or less OK, though there may be some syntax issues. Here's a working example:

String message = "%%NAME is inviting you.";
String name = "Diana";
String result = message.replaceAll("%%NAME", name);

    
Code: String message = "%%NAME is inviting you.";
String name = "Diana";
String result = message.replaceAll("%%NAME", name);

Complete the code as a full Java method.

# Answer

String message = "%%NAME is inviting you.";
String name = "Diana";
String result = message.replaceAll("%%NAME", name);

System.out.println(result);

# Answer

String message = "%%NAME is inviting you.";
String name = "Diana";
String result = message.replaceAll("%%NAME", name);

System.out.println(result);

# Answer

String message = "%%NAME is inviting you.";
String name = "Diana";
String result = message.replaceAll("%%NAME", name);

System.out.println(result);

Complete