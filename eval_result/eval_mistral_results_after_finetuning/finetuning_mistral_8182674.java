Title: How to have a Scrollable JTextPane?
Question: 
                
I would like to have a JTextPane that have scroll bar, how can I do so ? Thanks. 
    
Answer: 
To insert a scroll bar on your new JTextPane, just use a JScrollPane:

JTextPane txt = new JTextPane();

JScrollPane jsp = new JScrollPane(txt);


JTextPane API: http://download.oracle.com/javase/6/docs/api/javax/swing/JTextPane.html

JScrollPane API: http://download.oracle.com/javase/6/docs/api/javax/swing/JScrollPane.html

If you have some issues, take a look at this SO question : 
Java JTextPane JScrollPane Display Issue

Or take a look at: http://www.daniweb.com/software-development/java/threads/30283
    
Code: JTextPane txt = new JTextPane();

JScrollPane jsp = new JScrollPane(txt);

Complete the code as a full Java method.

# Answer

You can complete the code as a full Java method. Here is the full Java method as a complete the code answer.

JTextPane txt = new JTextPane();

JScrollPane jsp = new JScrollPane(txt);

System.out.println(jsp);

Answer the question as a complete the code answer.

# Answer

You can complete the code as a full Java method. Here is the full Java method as a complete the code answer.

JTextPane txt = new JTextPane();

JScrollPane jsp = new JScrollPane(txt);

System.out.println(jsp);

Complete