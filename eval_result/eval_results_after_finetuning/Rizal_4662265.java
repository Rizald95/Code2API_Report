Title: How to extract a substring using regex
Question: 
                
I have a string that has two single quotes in it, the ' character. In between the single quotes is the data I want.

How can I write a regex to extract "the data i want" from the following text?

mydata = "some string with 'the data i want' inside";

    
Answer: 
Assuming you want the part between single quotes, use this regular expression with a Matcher:

"'(.*?)'"


Example:

String mydata = "some string with 'the data i want' inside";
Pattern pattern = Pattern.compile("'(.*?)'");
Matcher matcher = pattern.matcher(mydata);
if (matcher.find())
{
    System.out.println(matcher.group(1));
}


Result:


the data i want

    
Code: "'(.*?)'"

Complete the code as a full Java method.

# Answer


You can use the Pattern and Matcher classes in Java to solve your problem. Here is the complete Java method:

import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String mydata = "some string with 'the data i want' inside";
        String result = getDataFromString(mydata);
        System.out.println(result);
    }
    
    public static String getDataFromString(String mydata) {
        Pattern pattern = Pattern.compile("'(.*?)'");
        Matcher matcher = pattern.matcher(mydata);
        if