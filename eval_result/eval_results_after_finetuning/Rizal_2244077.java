Title: how to execute command line .exe file in java
Question: 
                

i want to convert an avi file to 3gp
using java program.
For this i am using "E.M. Total
Video Converter Command Line 2.43"
and the command for it is
"C:\E.M.
TVCC>TVCC -f E:\TestVideo\01.avi -o
E:\OutputFiles\target.3gp"
I got a program to execute command
line exe file on site http://www.rgagnon.com/javadetails/java-0014.html which is:


Path to executable with spaces in them

You can include a path for the program to be executed. On the Win plateform, you need to put the path in quotes if the path contains spaces. 

public class Test {
  public static void main(String[] args) throws Exception {
    Process p = Runtime.getRuntime().exec(
       "\"c:/program files/windows/notepad.exe\"");
    p.waitFor();
  }
}


If you need to pass arguments, it's safer to a String array especially if they contain spaces. 

String[] cmd = { "myProgram.exe", "-o=This is an option" };
Runtime.getRuntime().exec(cmd);


If using the start command and the path of the file to be started contains a space then you must specified a title to the start command. 

String fileName = "c:\\Applications\\My Documents\\test.doc";
String[] commands = {"cmd", "/c", "start", "\"DummyTitle\"",fileName};
Runtime.getRuntime().exec(commands);


***Can anyone help me to put the above command in this code?***I dont know the syntax rules to put that command in the above code.Please help me.

This is the exact java code i am using:

public class Test {
    public static void main(String[] args) throws Exception {

        String[] cmd = { "C:\\Program Files\\E.M. TVCC\\TVCC.exe", "-f C:\\Program Files\\E.M. TVCC\\01.avi", "-o C:\\OutputFiles\\target.3gp" };
        Process p = Runtime.getRuntime().exec(cmd);
        p.waitFor();
    }
}


Answer: 
You can put the command in the string array as shown below:

String[] cmd = { "C:\\Program Files\\E.M. TVCC\\TVCC.exe", "-f", "C:\\Program Files\\E.M. TVCC\\01.avi", "-o", "C:\\OutputFiles\\target.3gp" };
Process p = Runtime.getRuntime().exec(cmd);
p.waitFor();


Complete the code as a full