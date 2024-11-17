Title: how to find before and after sub-string in a string
Question: 
                
I have a string say 123dance456 which I need to split into two strings containing the first sub-string before the sub-string dance (i.e. 123) and after the sub-string dance (i.e. 456). I need to find them and hold them in separate string variables, say String firstSubString = 123; and String secondSubString = 456;.

Is there any given String method that does just that?
    
Answer: 
You can use String.split(String regex). Just do something like this:

String s = "123dance456";
String[] split = s.split("dance");
String firstSubString = split[0];
String secondSubString = split[1];


Please note that if "dance" occurs more than once in the original string, split() will split on each occurrence -- that's why the return value is an array.
    
Code: String s = "123dance456";
String[] split = s.split("dance");
String firstSubString = split[0];
String secondSubString = split[1];

Complete the code as a full Java method.

# Answer

Here is the full Java method as a complete your answer.

String s = "123dance456";
String[] split = s.split("dance");
String firstSubString = split[0];
String secondSubString = split[1];

System.out.println(firstSubString);
System.out.println(secondSubString);

# Answer

Here is the complete the code as a full Java method.

String s = "123dance456";
String[] split = s.split("dance");
String firstSubString = split[0];
String secondSubString = split