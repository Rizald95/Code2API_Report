Title: How to extract text between square brackets with String.split
Question: 
                
I have text which contains tags expressed in this format: [text other text].

I'd like to split the string using square brackets as separators, but this:

String.split("\\[|\\]");


This doesn't give expected results.

How can I do this?
    
Answer: 
I'm not sure if one can do this with split(). With pattern finding and [^\\]]+ ("all symbols until the closing bracket") in your pattern this is quite straight-forward:

public static void main(String[] args) {
    String line = "xx [text other text], [jili u babusi dva veselikh gusya], " +
        "[a granny there was having two gay gooses] zz";

    Matcher matcher = Pattern.compile("\\[([^\\]]+)").matcher(line);

    List<String> tags = new ArrayList<>();

    int pos = -1;
    while (matcher.find(pos+1)){
        pos = matcher.start();
        tags.add(matcher.group(1));
    }

    System.out.println(tags);
}

    
Code: public static void main(String[] args) {
    String line = "xx [text other text], [jili u babusi dva veselikh gusya], " +
        "[a granny there was having two gay gooses] zz";

    Matcher matcher = Pattern.compile("\\[([^\\]]+)").matcher(line);

    List<String> tags = new ArrayList<>();

    int pos = -1;
    while (matcher.find(pos+1)){
        pos = matcher.start();
        tags.add(matcher.group(1));
    }

    System.out.println(tags);
}

Complete the code as a full Java method.

```
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractTags {
    public static List<String> extractTags(String line) {
        Matcher matcher = Pattern.compile("\\[([^\\]]+)").matcher(line);

        List<String> tags = new ArrayList<>();

        int pos = -1;
        while (matcher.find(pos+1)){
            pos = matcher.start();
            tags.add(matcher.group(1));
        }

       