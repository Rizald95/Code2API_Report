Title: How to get the second word from a String?
Question: 
                
Take these examples

Smith John
Smith-Crane John
Smith-Crane John-Henry
Smith-Crane John Henry


I would like to get the John
The first word after the space, but it might not be until the end, it can be until a non alpha character. How would this be in Java 1.5?
    
Answer: 
You can use regular expressions and the Matcher class:

String s = "Smith-Crane John-Henry";
Pattern pattern = Pattern.compile("\\s([A-Za-z]+)");
Matcher matcher = pattern.matcher(s);
if (matcher.find()) {
    System.out.println(matcher.group(1));
}


Result:


John

    
Code: String s = "Smith-Crane John-Henry";
Pattern pattern = Pattern.compile("\\s([A-Za-z]+)");
Matcher matcher = pattern.matcher(s);
if (matcher.find()) {
    System.out.println(matcher.group(1));
}

Complete the code as a full Java method.

# Answer

Here is the code as a full Java method:

String s = "Smith-Crane John-Henry";
Pattern pattern = Pattern.compile("\\s([A-Za-z]+)");
Matcher matcher = pattern.matcher(s);
if (matcher.lookingAt()) {
    System.out.println(matcher.group(1));
}


# Answer

Here is the code as a full Java method:

String s = "Smith-Crane John-Henry";
Pattern pattern = Pattern.compile("\\s([A-Za-z]+)");
Matcher matcher = pattern.match