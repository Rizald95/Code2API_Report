Title: How can I create a JTextArea with a specified width and the smallest possible height required to display all the text?
Question: 
                
In all the examples that I can find that use a JTextArea, the height & width is known before constructing the JTextArea, and if the JTextArea would require more height, then it is put inside of a JScrollPane. Obviously, the height of JTextArea is dependent on the width and the text contents. 

Now, my situation requires that I do not use a JScrollPane, but instead that the JTextArea be just tall enough to display all the text. When I create the JTextArea, I know the text contents and how much width it will have to work with; I don't know the height - I want that to be as small as possible without cutting off any of the text. This seems very difficult to accomplish.

As a side note, the JTextArea will be added to a JPanel that does not have a layout manager - it uses absolute positioning based on the added component's preferred size. This requires that my JTextArea would return the correct dimensions on getPreferredSize().  The correct dimensions should be the width that I provided when I constructed it, and the minimum height that is required to display all the text with the provided width.

I've found some similar threads that discuss the oddities/bugs involved with the JTextArea that are sometimes solved by calling pack() twice on the parent container. This is not an option for me. I'm tempted to basically create my own JTextArea that takes a width and String and computes the necessary minimum height based on the width and font settings, but I figured I would ask around first before spending the time to do that.

Hopefully my question is clear. Thank you all for your help!
    
Answer: 

  it uses absolute positioning based on the added component's preferred size. 


Sounds like the job of a layout manager.


  This requires that my JTextArea would return the correct dimensions on getPreferredSize().


JTextArea textArea = new JTextArea();
textArea.setLineWrap( true );
textArea.setWrapStyleWord( true );
textArea.setText("one two three four five six seven eight nine ten eleven twelve thirteen fourteen fifteen sixteen seventeen eighteen nineteen twenty");

Dimension preferredSize = textArea.getPreferredSize();

int width = 200;
int height = textArea.getLineCount() * textArea.getFontMetrics( textArea.getFont() ).getHeight();

textArea.setBounds( 0, 0, width, height );


You can use a layout manager to position the JTextArea, but you'll need to override the getPreferredSize() method to return the correct dimensions.


Here's an example of a custom layout manager that does this:

```java
import java.awt.*;
import