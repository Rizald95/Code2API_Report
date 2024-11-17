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

```
public String getFirstFourDigits(String str) {
    int fullInt = Integer.parseInt(str);
    String first4char = str.substring(0,4);
    int intForFirst4Char = Integer.parseInt(first4char);
    return first4char;
}
```

Now you can call this method with any string containing at least 4 digits and it will return the first 4 digits as a string.

```
String str = "1234567890";
String first4Digits = getFirstFourDigits(str);
System.out.println(first