Title: How to improve look and feel of JAVA swing GUI?
Question: 
                
I am working on a project that uses Java Swing. The default look and feel of the Java Swing GUI is very boring. Is there any way I can use a better look and feel? Something like on web pages...
    
Answer: 
You can set the look and feel to reflect the platform:

try { 
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
} catch (Exception e) {
    e.printStackTrace();
}


If this is not nice enough for you, take a look at SWT for Eclipse.
    
Code: try { 
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
} catch (Exception e) {
    e.printStackTrace();
}

Complete the code as a full Java method.

# Answer

You can set the look and feel to reflect the platform:

try {
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
} catch (Exception e) {
    e.printStackTrace();
}


If this is not nice enough for you, take a look at SWT for Eclipse.

Complete the code as a full Java method.

# Answer

You can set the look and feel to reflect the platform:

try {
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
} catch (Exception e) {
    e.printStackTrace