Title: How to read from user's input in Java and write it to a file
Question: 
                
I want to create a simple stand-alone application that will take some input from user (some numbers and mathematical functions f(x,y...)) and write them to a file. Then with the help of this file I will run a command.

Basic ingredients that I need:

-- JTextArea for users input.

-- ButtonHandler/ActionListener and writing of the input to a (txt) file

-- ButtonHandler/ActionLister to execute a command

What is the best way to do it?

A current running code that I have (basically a toy) - which does not write anything, just executes - is:

import java.applet.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Dialog;
import java.io.IOException;
import java.io.InputStream;
import java.io.*;
import java.util.*;
import java.io.BufferedWriter;

public class Runcommand3
{
  public static void main(String[] args) throws FileNotFoundException, IOException
  {
    //JApplet applet = new JApplet();
    //applet.init();

    final JFrame frame = new JFrame("Change Backlight");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    panel.setLayout(null);
    frame.add(panel);
    JButton button = new JButton("Click me to Run");
    button.setBounds(55,100,160,30);
    panel.add(button);

    frame.setSize(260,180);
    frame.setVisible(true);
    //This is an Action Listener which reacts to clicking on the button
    button.addActionListener(new ButtonHandler());
  }
}
 class ButtonHandler implements ActionListener{
                public void actionPerformed(ActionEvent event){
                double value = Double.parseDouble(
                JOptionPane.showInputDialog("please enter backlight value"));

                try{
                    Runtime rt = Runtime.getRuntime();
                    String cmd = "cmd /c echo " + value + " > backlight.txt";
                    Process p = rt.exec(cmd);
                    System.out.println("Running command : " + cmd);
                }
                catch(Exception e){
                    System.out.println("Exception : " + e);
                }
                }
            }



Upadte:

I am running the code as a java application.

I want to accept some numbers as input from user and write them to a file.

Then I