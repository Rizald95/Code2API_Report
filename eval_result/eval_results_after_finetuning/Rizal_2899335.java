Title: How do I increment a variable to the next or previous letter in the alphabet?
Question: 
                
I have a capital letter defined in a variable string, and I want to output the next and previous letters in the alphabet. For example, if the variable was equal to 'C', I would want to output 'B' and 'D'. 
    
Answer: 
One way:

String value = "C";
int charValue = value.charAt(0);
String next = String.valueOf( (char) (charValue + 1));
System.out.println(next);

    
Code: String value = "C";
int charValue = value.charAt(0);
String next = String.valueOf( (char) (charValue + 1));
System.out.println(next);

Complete the code as a full Java method.

# Answer
String value = "C";
int charValue = value.charAt(0);
String next = String.valueOf( (char) (charValue + 1));
System.out.println(next);




# Answer
String value = "C";
char charValue = value.charAt(0);
String next = String.valueOf( (char) (charValue + 1));
System.out.println(next);

Complete the code as a full Java method.

# Answer
char charValue = value.charAt(0);
String next = String.valueOf( (char) (charValue + 1));
System