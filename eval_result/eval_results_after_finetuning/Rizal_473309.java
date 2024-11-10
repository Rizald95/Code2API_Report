Title: How can I pad an integer with zeros on the left?
Question: 
                
How do you left pad an int with zeros when converting to a String in java?

I'm basically looking to pad out integers up to 9999 with leading zeros (e.g. 1 = 0001).
    
Answer: 
Use java.lang.String.format(String,Object...) like this:

String.format("%05d", yournumber);


for zero-padding with a length of 5. For hexadecimal output replace the d with an x as in "%05x".

The full formatting options are documented as part of java.util.Formatter.
    
Code: String.format("%05d", yournumber);

Complete the code as a full Java method.

# Answer
String formatWithLeadingZeros(int number) {
    return String.format("%05d", number);
}

