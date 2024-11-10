Title: How can I create a bar in the bottom of a Java app, like a status bar?
Question: 
                
I am in the process of creating a Java app and would like to have a bar
on the bottom of the app, in which I display a text bar and a status (progress) bar.

Only I can't seem to find the control in NetBeans neither do I know the code to create in manually.
    
Answer: 
Create a JFrame or JPanel with a BorderLayout, give it something like a BevelBorder or line border so it is seperated off from the rest of the content and then add the status panel at BorderLayout.SOUTH.

JFrame frame = new JFrame();
frame.setLayout(new BorderLayout());
frame.setSize(200, 200);

// create the status bar panel and shove it down the bottom of the frame
JPanel statusPanel = new JPanel();
statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
frame.add(statusPanel, BorderLayout.SOUTH);
statusPanel.setPreferredSize(new Dimension(frame.getWidth(), 16));
statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));
JLabel statusLabel = new JLabel("status");
statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
statusPanel.add(statusLabel);

frame.setVisible(true);


Here is the result of the above status bar code on my machine:




    
Code: JFrame frame = new JFrame();
frame.setLayout(new BorderLayout());
frame.setSize(200, 200);

// create the status bar panel and shove it down the bottom of the frame
JPanel statusPanel = new JPanel();
statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
frame.add(statusPanel, BorderLayout.SOUTH);
statusPanel.setPreferredSize(new Dimension(frame.getWidth(), 16));
statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));
JLabel statusLabel = new JLabel("status");
statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
statusPanel.add(statusLabel);

frame.setVisible(true);


Edit: I would like to add a progress bar to the status bar. Any idea how I can do that?
If you could provide an example I would appreciate it.

Answer: 
You can use JProgressBar for the progress bar.

JProgressBar progressBar = new JProgressBar(JProgressBar.VERTICAL, 0, 100);
progressBar.setStringPainted();
statusPanel.add(progressBar);


OR

JProgressBar progress