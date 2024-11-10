Title: How to layout multiple panels on a jFrame? (java)
Question: 
                


I am in the process of making my own java socket game. My game is painting alright to the full screen (where it says "paint graphics here", but im painting to the whole jframe at the moment). I want to add a textbox with a scroll bar for displaying only text, not taking any input and another textbox to take text inputs from the user and then a button to send the text, for chat purposes. But onto my question, how do I even start to lay this out? I understand I need a layout, but can someone help me on this? Here is my code at the moment (this code only sets up painting to the whole screen at the moment, need to divide the screen up now like I have in the picture above):

public class Setup extends JFrame implements Runnable{
     JPanel panel;
     JFrame window;
     public Setup(Starter start, JFrame window){
         window.setSize(600,500);
         window.setLocationRelativeTo(null);
         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         window.setResizable(false);
         panel = new Display(start);
         this.window = window;
     }
     public void run(){
         window.getContentPane().add(panel);
         window.setBackground(Color.BLACK);
         window.setVisible(true);
     }
}


"new Display(start)" - this extends jpanel, its basically where I paint everything graphics wise.

In addition, I've seen people add in different panels but I cant have them be the same size. Like in the picture, the "paint graphics here" panel is the biggest one, and so on.
    
Answer: 
The JPanel is actually only a container where you can put different elements in it (even other JPanels). So in your case I would suggest one big JPanel as some sort of main container for your window. That main panel you assign a Layout that suits your needs ( here is an introduction to the layouts). 

After you set the layout to your main panel you can add the paint panel and the other JPanels you want (like the textboxes and the button) to it.

Here is a simple example of how to add a JPanel to another JPanel using a GridLayout:

    import java.awt.BorderLayout;
    import java.awt.Color;
    import java.awt.Dimension;
    import java.awt.EventQueue;
    import java.awt.GridLayout;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.util.logging.Level;
    import java.util.logging.Logger;
    import javax.swing.JButton;
    import javax.swing.JFrame;
