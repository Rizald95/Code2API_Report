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

You can create a Java method like this:

    public class Main {
    
        public static void main(String[] args) {
            String theString = "First part - Second part";
            String[] parts = theString.split("-");
            String first = parts[0];
            String second = parts[1];
            System.out.println("first: " + first);
            System.out.println("second: " + second);
        }
    }


You can try this code here: IdeOne
    
Complete the code as a full Java method.

# Answer

You can create a Java