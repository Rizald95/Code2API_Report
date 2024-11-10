package com.chatgpt.api;
import java.sql.*;

public class Chatgpt19537440 {
    public static void connectToDatabase(String tnsAdmin, String entryFromTnsnames, String username, String password) throws Exception {
        System.setProperty("oracle.net.tns_admin", tnsAdmin);
        String dbURL = "jdbc:oracle:thin:@" + entryFromTnsnames;

        Class.forName("oracle.jdbc.OracleDriver");

        Connection conn = null;
        Statement stmt = null;

        try {
            conn = DriverManager.getConnection(dbURL, username, password);

            System.out.println("Connection established");

            stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT dummy FROM dual");

            if (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) try {
                stmt.close();
            } catch (Exception e) {
            }
            if (conn != null) try {
                conn.close();
            } catch (Exception e) {
            }
        }
    }
}
