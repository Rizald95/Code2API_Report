Title: how can I get the text before and after the "-" (dash)
Question: 
                
I have a String and I want to get the words before and after the " - " (dash). How can I do that?

example:
String: 

"First part - Second part"


output:

first: First part
second: Second part

    
Answer: 
With no error-checking or safety, this could work:

String[] parts = theString.split("-");
String first = parts[0];
String second = parts[1];

    
Code: String[] parts = theString.split("-");
String first = parts[0];
String second = parts[1];

Complete the code as a full Java method.

# Answer

String[] parts = theString.split("-");
String first = parts[0];
String second = parts[1];

System.out.println("first: " + first);
System.out.println("second: " + second);



# Answer

You can use the split() method for String.

String example = "First part - Second part";
String[] parts = example.split("-");
System.out.println(parts[0]);
System.out.println(parts[1]);



# Answer

You can use the split() method on a String.

String example = "First part - Second