Title: How to extract numbers from a string and get an array of ints?
Question: 
                
I have a String variable (basically an English sentence with an unspecified number of numbers) and I'd like to extract all the numbers into an array of integers. I was wondering whether there was a quick solution with regular expressions?



I used Sean's solution and changed it slightly:

LinkedList<String> numbers = new LinkedList<String>();

Pattern p = Pattern.compile("\\d+");
Matcher m = p.matcher(line); 
while (m.find()) {
   numbers.add(m.group());
}

    
Answer: 
Pattern p = Pattern.compile("-?\\d+");
Matcher m = p.matcher("There are more than -2 and less than 12 numbers here");
while (m.find()) {
  System.out.println(m.group());
}


... prints -2 and 12.



-? matches a leading negative sign -- optionally. \d matches a digit, and we need to write \ as \\ in a Java String though. So, \d+ matches 1 or more digits.
    
Code: Pattern p = Pattern.compile("-?\\d+");
Matcher m = p.matcher("There are more than -2 and less than 12 numbers here");
while (m.find()) {
  System.out.println(m.group());
}

Complete the code as a full Java method.

# Answer

You can try to use regular expressions with the Pattern and Matcher classes.

Here is a full Java method:

    import java.util.regex.Pattern;
    import java.util.regex.Matcher;
    import java.util.ArrayList;
    import java.util.List;

    public class Main {
        public static void main(String[] args) {
            String numbersAsString = "There are more than -2 and less than 12 numbers here";
            List<String> numbersAsText = getNumbersFromString(numbersAsString);
            System.out.println(numbersAsText);
        }

