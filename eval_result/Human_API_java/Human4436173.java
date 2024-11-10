package com.stackoverflow.api;

import java.sql.Connection;
import java.sql.DriverManager;

public class Human4436173 {

  public static Connection initConnection() throws Exception {
    String driverName = "org.gjt.mm.mysql.Driver";
    Class.forName(driverName);

    String serverName = "localhost";
    String mydatabase = "mydatabase";
    String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

    String username = "username";
    String password = "password";
    return DriverManager.getConnection(url, username, password);
  }
}
