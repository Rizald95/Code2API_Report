Title: Java - How to create a custom dialog box?
Question: 
                
I have a button on a JFrame that when clicked I want a dialog box to popup with multiple text areas for user input.  I have been looking all around to try to figure out how to do this but I keep on getting more confused. Can anyone help?
    
Answer: 
If you don't need much in the way of custom behavior, JOptionPane is a good time saver.  It takes care of the placement and localization of OK / Cancel options, and is a quick-and-dirty way to show a custom dialog without needing to define your own classes.  Most of the time the "message" parameter in JOptionPane is a String, but you can pass in a JComponent or array of JComponents as well.

Example:

JTextField firstName = new JTextField();
JTextField lastName = new JTextField();
JPasswordField password = new JPasswordField();
final JComponent[] inputs = new JComponent[] {
        new JLabel("First"),
        firstName,
        new JLabel("Last"),
        lastName,
        new JLabel("Password"),
        password
};
int result = JOptionPane.showConfirmDialog(null, inputs, "My custom dialog", JOptionPane.PLAIN_MESSAGE);
if (result == JOptionPane.OK_OPTION) {
    System.out.println("You entered " +
            firstName.getText() + ", " +
            lastName.getText() + ", " +
            password.getText());
} else {
    System.out.println("User canceled / closed the dialog, result = " + result);
}

    
Code: JTextField firstName = new JTextField();
JTextField lastName = new JTextField();
JPasswordField password = new JPasswordField();
final JComponent[] inputs = new JComponent[] {
        new JLabel("First"),
        firstName,
        new JLabel("Last"),
        lastName,
        new JLabel("Password"),
        password
};
int result = JOptionPane.showConfirmDialog(null, inputs, "My custom dialog", JOptionPane.PLAIN_MESSAGE);
if (result == JOptionPane.OK_OPTION) {
    System.out.println("You entered " +
            firstName.getText() + ", " +
            lastName.getText() + ", " +
            password.getText());
} else {
    System.out.println("User canceled / closed the dialog, result = " + result);
}

Complete the code as a full Java method.

# Answer

Here is the code as a full Java method.

# Answer

Here is the code as a full Java method.

JTextField firstName = new JTextField();
JTextField lastName = new JPasswordField();
JPasswordField password = new JPasswordField();
final JComponent[] inputs