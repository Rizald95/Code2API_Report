package com.stackoverflow.api;

import java.io.*;
import java.net.*;

public class Human3871163 {

  public static String dataInputStream2String(DataInputStream dis) {
    String tmp = null;
    try {
      StringBuffer inputLine = new StringBuffer();
      while ((tmp = dis.readLine()) != null) {
        inputLine.append(tmp);
      }
      //use inputLine.toString(); here it would have whole source
      dis.close();
    } catch (MalformedURLException me) {
      System.out.println("MalformedURLException: " + me);
    } catch (IOException ioe) {
      System.out.println("IOException: " + ioe);
    }
    return tmp;
  }
}
