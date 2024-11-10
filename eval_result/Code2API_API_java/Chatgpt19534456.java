package com.chatgpt.api;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Chatgpt19534456 {
    public static int getRowCount(String url, String user, String password, String query) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
        Connection con = DriverManager.getConnection(url, user, password);
        Statement stmt = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery(query);
        if (rs.next()) {
            rs.last();
            return rs.getRow();
        } else {
            return 0;
        }
    }
}
