Title: How to show/hide JPanels in a JFrame?
Question: 
                
The application I am developing is a game.  What I want to do is have JPanels that appear in the JFrame, like a text or message window, and then disappear when they are no longer used.  I have designed these JPanels in Netbeans as external classes and want to be able to call them in an actionPerformed() method.  JOptionPanes or other popup dialogs are not an option because they take the focus away from the game.  I also saw someone suggest a CardLayout in a similar question.  This is not what I want because I am not just trying to swap the panes.  They should go away when the program tells them to.  How would I do this, say by binding it to a JButton Action?
    
Answer: 
You can hide a JPanel by calling setVisible(false). For example:

public static void main(String args[]){
    JFrame f = new JFrame();
    f.setLayout(new BorderLayout());
    final JPanel p = new JPanel();
    p.add(new JLabel("A Panel"));
    f.add(p, BorderLayout.CENTER);

    //create a button which will hide the panel when clicked.
    JButton b = new JButton("HIDE");
    b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
                p.setVisible(false);
        }
    });

    f.add(b,BorderLayout.SOUTH);
    f.pack();
    f.setVisible(true);
}

    
Code: public static void main(String args[]){
    JFrame f = new JFrame();
    f.setLayout(new BorderLayout());
    final JPanel p = new JPanel();
    p.add(new JLabel("A Panel"));
    f.add(p, BorderLayout.CENTER);

    //create a button which will hide the panel when clicked.
    JButton b = new JButton("HIDE");
    b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
                p.setVisible(false);
        }
    });

    f.add(b,BorderLayout.SOUTH);
    f.pack();
    f.setVisible(true);
}











































































































