Title: How to remove the carriage return from string while pasting content to Excel file
Question: 
                
I have a problem while pasting my contents (or text) generated by Java code into excel.
The problem is that my Java code generates a String with multiple lines, i.e. with line breaks (\n) included.  When I try to copy this content and paste it into an Excel file, I am getting a multiline text with a square box symbol.  I came to know that Windows uses \r\n for line breaks and not just \n.  I tried to replace my \n with \r\n and paste the generated text, but I am getting the same square boxes in my Excel file.  Here is my sample code:

      String   myString = "a1\nb1";
      String   tmpString =myString.replace("\n","\r\n");
      System.out.println( "Original = " +"\""+myString+"\"");
      System.out.println( "Result   = " +"\""+tmpString+"\"");


I have used the " " to wrap the text.  When I tried to paste tmpstring in Excel, I got the square box.  How can I remove the boxes with multiple lines in my cell?
    
Answer: 
Do you want the carriage return / newline, or don't you? Your title says that you don't, your code is explicitly adding carriage returns when the string has a newline. If you want to get rid of both, use String.replaceAll(), which takes a regex:

public static void main(String[] argv)
throws Exception
{
    String s1 = "this\r\nis a test";
    String s2 = s1.replaceAll("[\n\r]", "");
    System.out.println(s2);
} 


This example finds any occurrence of the characters, and deletes them. You probably want to look for the sequence of characters and replace with a space, but I'll leave that up to you: look at the doc for java.util.regex.Pattern.

And I suspect that the "box" is some other character, not a return or newline.
    
Code: public static void main(String[] argv)
throws Exception
{
    String s1 = "this\r\nis a test";
    String s2 = s1.replaceAll("[\n\r]+", " ");
    System.out.println(s2);
} 


DEMO

If you run this as a Java method, you get: this is a test

Cheers,

AnotherUser

Question: 
               
I tried the regular expression you mentioned. It works if the test string is: this
               
If the test string is: this
               
                String s1 = "this\r\nis a test";
                String s2 = s1.replaceAll("[\n