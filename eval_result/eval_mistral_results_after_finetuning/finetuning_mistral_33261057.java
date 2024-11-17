Title: How can i replace double quotes with escape character in java?
Question: 
                
I have such text :

"fullName":"\"Some full name\"" .


How could i replace "" with " ? I tried like this :

text.replace("\"\"","\"");


But i got "fullName":"\"Some full name\". As you can see only second "" have been replaced by ".
    
Answer: 
You should first replace \" with " and then replace "" with ".

You can do it by chaining a few String#replaceAll() calls:

text = text.replaceAll("\\\"","\"").replaceAll("\"\"", "\"");
System.out.println(text);


which will produce

"fullName":"Some full name"

    
Code: text = text.replaceAll("\\\"","\"").replaceAll("\"\"", "\"");
System.out.println(text);

Complete the code as a full Java method.

# Answer

You can use the following code:

text = text.replaceAll("\\\"","\"").replaceAll("\"\"", "\"");
System.out.println(text);


With this code as a full Java method.

# Answer

Here is the full Java method as a complete your answer.

text = text.replaceAll("\\\"","\"").replaceAll("\"\"", "\"");
System.out.println(text);


Complete the code as a full Java method.

# Answer

text = text.replaceAll("\\\"","\"").replaceAll("\"\"", "\"");
