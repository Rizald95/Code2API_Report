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

```
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quotes {
    public static List<String> getWordsBetweenQuotes(String line) {
        List<String> words = new ArrayList<>();
        Pattern p = Pattern.compile("\"([^\"]*)\"");
        Matcher m = p.matcher(line);
        while (m.find()) {
            words.add(m.group(1));
        }
        return words;
    }
}
```

You can use this