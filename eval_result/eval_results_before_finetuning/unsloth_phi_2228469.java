Title: How to find out the preferred size of a JPanel which is not displayed, according to its content?
Question: 
                
I am using a JPanel (with several labels inside) to add a dynamic information on a graph. This panel is dynamically created, it is not visible before I use it to draw.

For this, I am using a BufferedImage, and I follow approximately the same steps as described on this other question. It works good, as long as I specify all sizes (the panel, and its components).

Like asked as well in comments of the referred question, how can I determine the optimal size of this panel? The same operation would be done if this panel was displayed in a regular frame/layout setting. 

In my case, how can I "pack", in a way, this panel, so that its size, and size of its content are set to the optimal (determined by the size of labels, then)?
    
Answer: 
Suraj and willcodejavaforfood put me on the good track. 

Checking what is actually done in a pack() method, I see that this is mostly setting the current size to the one returned by getPreferredSize().

From this, I managed to make such solution: 

// Creating the panel
JPanel lPanel = new JPanel();
//lPanel.setSize(1000, 1000); //default size, not needed anymore
lPanel.setLayout(new BoxLayout(lPanel, BoxLayout.PAGE_AXIS));

//Adding the content
lPanel.add(new JLabel("Blah"));
// etc...

//Adjust the panel to its preferred size
lPanel.setSize(lPanel.getPreferredSize());

//Call the layout method 
//(this will adjust the content components to their correct size and position)
lPanel.doLayout();


This method works correctly, and adjusts the panel and its content to the correct size (and answers my question in a simplistic way: "how to find the preferred size? getPreferredSize()").

However, it requires to set the initial size to a large enough size, so that the content fits in, or they won't be put on the layout. This is a bit pity, and not really "clean".

Is there a better way to do this?









































































































































