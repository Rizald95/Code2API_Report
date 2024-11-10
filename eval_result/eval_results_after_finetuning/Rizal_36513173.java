Title: How Can I Format A HTML Page I'm Outputting From Java?
Question: 
                
I am messing around with a small project this weekend, and part of it I want to take the results of my output that would normally go to my console and output them to an HTML file. 

     File file = new File("C:/Users/Files/Desktop/TestTest/Test22.html");
    FileOutputStream fos = new FileOutputStream(file);
    PrintStream ps = new PrintStream(fos);
    System.setOut(ps);
    System.out.println("The Total of this output is" + totalAmt);
    System.out.println("Average amount is " + average);


Now both lines print out just fine. But they print out on one line, nearly run together, and just don't look appealing in the slightest. Is there anything I can do in Eclipse to format the html page before I print my values to it?
    
Answer: 
You can do one of two things. The first is code the html formatting into your program to be written out. In other words, something like inserting

System.out.println("<br />");


between your print statments.

The other thing you could do is write a formatted html page and read it from memory as a long string, and then only overwrite the things you want to, perhaps by searching for specific tags and editing the text between them. When you are done you can save the file back.

If all you need is a little bit of simple formatting, the first method will be better. If the page you want is quite complex, the second is the way to go.
    
Code: System.out.println("<br />");

Complete the code as a full Java method.

Answer: 
Method: 

public void printToHtmlPage(String totalAmt, String average){
    
File file = new File("C:/Users/Files/Desktop/TestTest/Test22.html");
FileOutputStream fos = new FileOutputStream(file);
PrintStream ps = new PrintStream(fos);
System.setOut(ps);
System.out.println("<html><body>");
System.out.println("<h1>The Total of this output is" + totalAmt+"</h1>");
System.out.println("<br />");
System.out.println("<h1>Average amount is " + average +