Title: How to iterate over regex expression
Question: 
                
Let's say I have the following String:

name1=gil;name2=orit;


I want to find all matches of name=value and make sure that the whole string matches the pattern.

So I did the following:


Ensure that the whole pattern matches what I want.

Pattern p = Pattern.compile("^((\\w+)=(\\w+);)*$");
Matcher m = p.matcher(line);
if (!m.matches()) {
    return false;
}

Iterate over the pattern name=value

Pattern p = Pattern.compile("(\\w+)=(\\w+);");
Matcher m = p.matcher(line);
while (m.find()) {
    map.put(m.group(1), m.group(2));
}



Is there some way to do this with one regex?
    
Answer: 
You can validate and iterate over matches with one regex by:

Ensuring there are no unmatched characters between matches (e.g. name1=x;;name2=y;) by putting a \G at the start of our regex, which mean "the end of the previous match".

Checking whether we've reached the end of the string on our last match by comparing the length of our string to Matcher.end(), which returns the offset after the last character matched.


Something like:
String line = "name1=gil;name2=orit;";
Pattern p = Pattern.compile("\\G(\\w+)=(\\w+);");
Matcher m = p.matcher(line);
int lastMatchPos = 0;
while (m.find()) {
   System.out.println(m.group(1));
   System.out.println(m.group(2));
   lastMatchPos = m.end();
}
if (lastMatchPos != line.length())
   System.out.println("Invalid string!");

Live demo.
    
Code: String line = "name1=gil;name2=orit;";
Pattern p = Pattern.compile("\\G(\\w+)=(\\w+);");
Matcher m = p.matcher(line);
int lastMatchPos = 0;
while (m.find()) {
   System.out.println(m.group(1));
   System.out.println(m.group(2));
   lastMatchPos = m.end();
}
if (lastMatchPos != line.length())
   System.out.println("Invalid string!");

Complete the code as a full Java method.

# Answer

You can validate and iterate over matches with one regex by:

Ensuring there are no unmatched characters between matches (e.g. name1=x;;