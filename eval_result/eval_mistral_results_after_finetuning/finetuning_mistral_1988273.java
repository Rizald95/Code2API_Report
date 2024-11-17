Title: How do I get a webpage to open up in a frame?
Question: 
                
How do I get a webpage to open up in a frame?

(I'm using netbeans and java)

e.g in a html page you can use 

  <frame src="http://www.google.com">


and it will display google in the frame.

I don't want it to open a browser, just to open up within the frame. How can I do that?
    
Answer: 
Here is a quick example of how to load google with the JEditorPane. I hope this is what you are looking for, but I'm still not 100% sure what exactly you want. If you could provide a bit more information about what you are doing I would be able to help you more. 

import javax.swing.*;

public class GetWebPage {
    public static void main(String args[]) throws Exception {
        JEditorPane website = new JEditorPane("http://www.google.com/");
        website.setEditable(false);

        JFrame frame = new JFrame("Google");
        frame.add(new JScrollPane(website));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
    }

}

    
Code: import javax.swing.*;

public class GetWebPage {
    public static void main(String args[]) throws Exception {
        JEditorPane website = new JEditorPane("http://www.google.com/");
        website.setEditable(false);

        JFrame frame = new JFrame("Google");
        frame.add(new JScrollPane(website));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
    }

}

Complete the code as a full Java method.

# Answer

Here is a quick example of how to load google with the JEditorPane. I hope this is what you are looking for, but I'm still not 100% sure what exactly you want. If you could provide a bit more information about what you are doing I would be able to help you more.

import javax.swing.*;

public class GetWebPage {
    public static void main(String args[]) throws Exception {
        JEditorPane website = new JEditorPane("http://www.google.com/");
        website.setEditable(false);

        JFrame frame = new JFrame("Google");
        frame.add(new