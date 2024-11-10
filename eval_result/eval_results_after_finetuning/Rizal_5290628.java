Title: How can I extract the first 4 digits from an int? (Java)
Question: 
                
I'm looking to find a way to convert a string to an int in order to then extract and return the first 4 digits in this int. 

Note: It must remain as a String for the other methods to work properly, though.
    
Answer: 
Try following:

String str = "1234567890";
int fullInt = Integer.parseInt(str);
String first4char = str.substring(0,4);
int intForFirst4Char = Integer.parseInt(first4char);


Wherever you want integer for first four character use intForFirst4Char and where you wanna use string use appropriate.

Hope this helps.
    
Code: String str = "1234567890";
int fullInt = Integer.parseInt(str);
String first4char = str.substring(0,4);
int intForFirst4Char = Integer.parseInt(first4char);

Complete the code as a full Java method.

# Answer
You can use the following code as a full Java method:

    public String getFirstFourCharOfNumberString(String numberString) {
        int fullInt = Integer.parseInt(numberString);
        String first4char = numberString.substring(0,4);
        int intForFirst4Char = Integer.parseInt(first4char);
        System.out.println(intForFirst4Char);
        return first4char;
    }

You can call this method as:

    getFirstFourCharOfNumberString("1234567890");


