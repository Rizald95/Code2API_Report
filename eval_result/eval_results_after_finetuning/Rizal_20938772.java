Title: How does the concatenation of a String with characters work in Java?
Question: 
                
The following is a problem from codingbat.


  Given a string, return a string where for every char in the original, there are two chars.
  e.g.:

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"



I have two statements that can do this, but the statement in the comment doesn't give the excepted output:

public String doubleChar(String str) {
    String str1 = "";
    for(int i=0;i<str.length();i++)
    {
        //str1 += str.charAt(i) + str.charAt(i);
        str1 += str.substring(i,i+1)+str.substring(i,i+1);
    }
    return str1;
}


If I change the commented part to str1 = str1 + str.charAt(i) + str.charAt(i), the output is as required. I am not able to understand this. If the concatenation doesn't, then it shouldn't work for either of the case. Can you help me in this?
    
Answer: 
str.charAt(i) returns a char, adding two chars results in a char with a codepoint equal to the sum of the input codepoints. When you start with str +, the first concatenation is between a String and a char, which results in a String, followed by the second concatenation, also between a String and a char.

You can fix this a few ways, such as:

str1 += String.valueOf(str.charAt(i)) + str.charAt(i);


or

str1 += "" + str.charAt(i) + str.charAt(i);


or, as you've already discovered, and likely the most readable:

str1 = str1 + str.charAt(i) + str.charAt(i);

    
Code: str1 += String.valueOf(str.charAt(i)) + str.charAt(i);

Complete the method using the String constant value of the charAt() method.

# Answer

You can use the String constant value of the charAt() method, which is String.valueOf(). So your code will be:

public String doubleChar(String str) {
    String str1 = "";
    for(int i=0;i<str.length();i++)
    {
        str1 += String.valueOf(str.charAt(i)) + str.charAt(i);
    }
    return str1;
}


You can also go with:

str1 += "" + str.charAt(i) + str