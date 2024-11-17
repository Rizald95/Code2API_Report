Title: how to get data between quotes in java?
Question: 
                
I have this lines of text the number of quotes could change  like: 

Here just one "comillas"
But I also could have more "mas" values in "comillas" and that "is" the "trick"
I was thinking in a method that return "a" list of "words" that "are" between "comillas"


How I obtain the data between the quotes? 

The result should be:  

comillas
mas, comillas, trick
a, words, are, comillas  
    
Answer: 
You can use a regular expression to fish out this sort of information. 

Pattern p = Pattern.compile("\"([^\"]*)\"");
Matcher m = p.matcher(line);
while (m.find()) {
  System.out.println(m.group(1));
}


This example assumes that the language of the line being parsed doesn't support escape sequences for double-quotes within string literals, contain strings that span multiple "lines", or support other  delimiters for strings like a single-quote.
    
Code: Pattern p = Pattern.compile("\"([^\"]*)\"");
Matcher m = p.matcher(line);
while (m.find()) {
  System.out.println(m.group(1));
}

Complete the code as a full Java method.

# Answer

You can use POSIX character classes (see here):

Pattern p = Pattern.compile("\"([^\"]*)\"");
Matcher m = p.matcher("Here just one \"comillas\", But I also could have more \"mas\", \"values\" in \"comillas\" and that \"trick\"");
while (m.lookingAt()) {
  System.out.println(m.group(1));
  m.lookingAt();
}


# Answer

You can use POSIX character classes (see here):

Pattern p = Pattern.compile("\"([^\"]*)\"");
Matcher m = p.matcher("