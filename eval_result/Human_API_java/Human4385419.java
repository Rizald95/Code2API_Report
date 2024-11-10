package com.stackoverflow.api;

import java.sql.Connection;
import java.sql.DriverManager;

public class Human4385419 {

  public static Connection connectMySql(
    String myUrl,
    String user,
    String password
  ) {
    Connection conn = null;
    try {
      // create a java mysql database connection
      String myDriver = "org.gjt.mm.mysql.Driver";
      Class.forName(myDriver);
      conn = DriverManager.getConnection(myUrl, user, password);
    } catch (Exception e) {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
    return conn;
  }
}
