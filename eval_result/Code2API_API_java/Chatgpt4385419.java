package com.chatgpt.api;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Chatgpt4385419 {
    public static void connectToMysql() {
        try {
            // create a java mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/test";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            // your prepstatements goes here...

            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}
