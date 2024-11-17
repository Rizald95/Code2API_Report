Title: How to search a char array for a specific char?
Question: 
                
Lets say I have a char array that contains the sequences of chars: "robots laser car"
I want to search for spaces in this char array in order to identify each separate word. I wanted to do something like this pseudocode below:

for lengthOfArray
    if array[i].equals(" ")
        doSomething();

But I cant find array methods to that comparison.
    
Answer: 
It's not exactly what you're asking for, but I'll throw it out there anyway: if you have a String instead of a char array, you can split by whitespace to get an array of strings containing the separate words.

String s = new String(array);
String[] words = s.split("\\s+");
// words = { "robots", "laser", "car" }


The \s+ regular expression matches one or more whitespace characters (space, carriage return, etc.), so the string will be split on any whitespace.
    
Code: String s = new String(array);
String[] words = s.split("\\s+");
// words = { "robots", "laser", "car" }

Complete the code as a full Java method.

# Answer

You can use the String method split():

String test = "robots laser car";
String[] words = test.split(" ");
System.out.println(words[0]);   // prints robots


# Answer

You can use the String method split():

String test = "robots laser car";
String[] words = test.split(" ");
System.out.println(words[0]);   // prints robots


Complete the code as a full Java method.

# Answer

You can use the String method split():

String test = "robots laser car";
String[] words = test.split(" ");