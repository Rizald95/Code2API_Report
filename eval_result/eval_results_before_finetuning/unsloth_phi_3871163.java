Title: How to convert the DataInputStream to the String in Java?
Question: 
                
I want to ask a question about Java. I have use the URLConnection in Java to retrieve the DataInputStream. and I want to convert the DataInputStream into a String variable in Java. What should I do? Can anyone help me. thank you.

The following is my code:

URL data = new URL("http://google.com");
URLConnection dataConnection = data.openConnection();
DataInputStream dis = new DataInputStream(dataConnection.getInputStream());
String data_string;
// convent the DataInputStream to the String

    
Answer: 
import java.net.*;
import java.io.*;

class ConnectionTest {
    public static void main(String[] args) {
        try {
            URL google = new URL("http://www.google.com/");
            URLConnection googleConnection = google.openConnection();
            DataInputStream dis = new DataInputStream(googleConnection.getInputStream());
            StringBuffer inputLine = new StringBuffer();
            String tmp; 
            while ((tmp = dis.readLine()) != null) {
                inputLine.append(tmp);
                System.out.println(tmp);
            }
            //use inputLine.toString(); here it would have whole source
            dis.close();
        } catch (MalformedURLException me) {
            System.out.println("MalformedURLException: " + me);
        } catch (IOException ioe) {
            System.out.println("IOException: " + ioe);
        }
    }
}  


This is what you want.   
    
Code: import java.net.*;
import java.io.*;

class ConnectionTest {
    public static void main(String[] args) {
        try {
            URL google = new URL("http://www.google.com/");
            URLConnection googleConnection = google.openConnection();
            DataInputStream dis = new DataInputStream(googleConnection.getInputStream());
            StringBuffer inputLine = new StringBuffer();
            String tmp; 
            while ((tmp = dis.readLine()) != null) {
                inputLine.append(tmp);
                System.out.println(tmp);
            }
            //use inputLine.toString(); here it would have whole source
            dis.close();
        } catch (MalformedURLException me) {
            System.out.println("MalformedURLException: " + me);
        } catch (IOException ioe) {
            System.out.println("IOException: " + ioe);
        }
    }
}

A: You can use BufferedReader to read the DataInputStream into a String.
BufferedReader br = new BufferedReader(new InputStreamReader(dis));
String line;
while ((line = br.readLine()) != null) {
    System.out.println(line);
}

A: You can use