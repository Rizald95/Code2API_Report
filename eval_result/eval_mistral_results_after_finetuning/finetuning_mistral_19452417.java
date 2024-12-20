Title: User will input some filter criteria -- how can I turn it into a regular expression for String.match
Question: 
                
I have a program where the user will enter a string such as 
PropertyA = "abc_*" and I need to have the asterisk match any character.

In my code, I'm grabbing the property value and replacing PropertyA with the actual value. For instance, it could be abc_123. I also pull out the equality symbol into a variable.

It should be able to cover this type of criteria


  PropertyB = 'cba' 
  
  PropertyC != '*-this'


valueFromHeader is the lefthand side and value is the righthand side. 

if (equality.equals("=")) {
    result = valueFromHeader.matches(value);
} else if (equality.equals("!=")) {
    result = !valueFromHeader.matches(value);
}


EDIT:

The existing code had this type of replacement for regular expressions

    final String ESC = "\\$1";
    final String NON_ALPHA = "([^A-Za-z0-9@])";
    final String WILD = "*";
    final String WILD_RE_TEMP = "@";
    final String WILD_RE = ".*";
    value = value.replace(WILD, WILD_RE_TEMP);
    value = value.replaceAll(NON_ALPHA,ESC);
    value = value.replace(WILD_RE_TEMP, WILD_RE);


It doesn't like the underscore here...

abcSite_123 != abcSite_123 (evaluates to true)
abcSite_123$1.matches("abcSite$1123")


It doesn't like the underscore...
    
Answer: 
Replace * with .*..

value=value.replace("*",".*");//replace  * with .*


This won't work if your value contain +,? since they all have special meaning in regex.Escape them if their are any..
    
Code: value=value.replace("*",".*");//replace  * with .*

Complete the code as a full Java method.

# Answer

You can try to escape the * with a \\ before it.

value=value.replace("*","\\*");


# Answer

You can use POSIX character classes (see here):

value=value.replace("*",".");
value=value.replaceAll(".", "\\Q.\E");


# Answer

You can use POSIX character classes (see here):

value=value.replace("*",".");
value=value.replaceAll(".", "\\Q.\E");


Here