package com.stackoverflow.api;

import java.sql.Connection;
import java.sql.DriverManager;

public class Human19537440 {

  public static Connection connectToOracle(
    String dbURL,
    String driver,
    String username,
    String password
  ) throws ClassNotFoundException {
    System.setProperty(
      "oracle.net.tns_admin",
      "C:/app/product/11.2.0/client_1/NETWORK/ADMIN"
    );
    Class.forName(driver);
    Connection conn = null;

    try {
      conn = DriverManager.getConnection(dbURL, username, password);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return conn;
  }
}
