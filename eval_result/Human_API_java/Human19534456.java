package com.stackoverflow.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Human19534456 {

  public static int numberOfReturnedHSQLDBBResultSet(
    String URL,
    String USER,
    String PASS,
    String query
  ) {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
      Connection con = DriverManager.getConnection(URL, USER, PASS);
      Statement stmt = con.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY
      );
      ResultSet rs = stmt.executeQuery(query);
      if (rs.next()) {
        rs.last();
        return rs.getRow();
      } else {
        return 0;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return -1;
  }
}
