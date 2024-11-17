Title: How can I split a string based on chaging characters rather than one single separator?
Question: 
                
I'm looking for a solution in java that will allow me to split a String like this one "MM/dd/yyyy", not based on the "/" slash but based on the change from "M" to "d" and from "d" to "y"?

The reason is that I may also need to split a string using this logic that has no separator at all, for example "yyMMdd". Note: I'm looking for splitting the pattern string itself, and not some actual date string which follows those patterns.

Any ideas?
    
Answer: 
Given that you just want to split pattern - yy/MM/dd or any other, and not an actual date formatted to those patterns, I would rather use Matcher here, instead of split().

String patternString = "yy/MM/dd";
Pattern pattern = Pattern.compile("y+|M+|d+");
Matcher matcher = pattern.matcher(patternString);

while (matcher.find()) {
    System.out.println(matcher.group());
}


This solution rather than splitting on some unknown delimiter, just finds a sequence of y or M or d (As in any pattern, those will be coming in sequence only).
    
Code: String patternString = "yy/MM/dd";
Pattern pattern = Pattern.compile("y+|M+|d+");
Matcher matcher = pattern.matcher(patternString);

while (matcher.find()) {
    System.out.println(matcher.group());
}

Complete the code as a full Java method.

public List<String> splitPattern(String pattern) {
    Pattern pattern = Pattern.compile("y+|M+|d+");
    Matcher matcher = pattern.matcher(pattern);
    List<String> result = new ArrayList<>();

    while (matcher.find()) {
        result.add(matcher.group());
    }

    return result;
}

Now you can call the method with any pattern you want to split.

List<String> result = splitPattern("yy/MM/dd");
System.out.println(result); // [yy, MM, dd]

List<String> result =