Title: Java: How to split a string by a number of characters?
Question: 
                
I tried to search online to solve this question but I didn't found anything.

I wrote the following abstract code to explain what I'm asking:

String text = "how are you?";

String[] textArray= text.splitByNumber(4); //this method is what I'm asking
textArray[0]; //it contains "how "
textArray[1]; //it contains "are "
textArray[2]; //it contains "you?"


The method splitByNumber splits the string "text" every 4 characters. How I can create this method??

Many Thanks
    
Answer: 
I think that what he wants is to have a string split into substrings of size 4. Then I would do this in a loop:

List<String> strings = new ArrayList<String>();
int index = 0;
while (index < text.length()) {
    strings.add(text.substring(index, Math.min(index + 4,text.length())));
    index += 4;
}

    
Code: List<String> strings = new ArrayList<String>();
int index = 0;
while (index < text.length()) {
    strings.add(text.substring(index, Math.min(index + 4,text.length())));
    index += 4;
}

Complete the code as a full Java method.

Here is a possible implementation of the method:

public static List<String> splitStringByNumber(String text, int size) {
    List<String> strings = new ArrayList<String>();
    int index = 0;
    while (index < text.length()) {
        strings.add(text.substring(index, Math.min(index + size,text.length())));
        index += size;
    }
    return strings;
}

You can call this method like this:

String text = "how are you?";
List<String> textArray = splitStringByNumber(text, 4);

for (String part :