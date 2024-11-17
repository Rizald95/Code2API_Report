Title: How to connect JDBC to tns oracle
Question: 
                
I can connect from plsql to database using tns file

Now I want to connect to the database from my Java using JDBC.

What I tried:

I search google and I find that I have to using this connection String:

"jdbc:oracle:thin:@//host:port))/tnsfile)";


My computer name is myPC

The port that is written in the tnsfile is 5151

So I tried this connection String

"jdbc:oracle:thin:@//myPC:5151))/tnsfile"


but I got this Exception

java.sql.SQLRecoverableException: IO ERROR: SO Exception was generated


What am I doing wrong?

How to connect my JDBC to the database using tns file?
    
Answer: 
You have to set a property named oracle.net.tns_admin to point to the location of the folder containing your tnsnames.ora file. Then you specify the entry from that file after the @ sign in your DB URL. Check example below. You can find more information here: Data sources and URLs - Oracle Documentation

import java.sql.*;

public class Main {
  public static void main(String[] args) throws Exception {
    System.setProperty("oracle.net.tns_admin", "C:/app/product/11.2.0/client_1/NETWORK/ADMIN");
    String dbURL = "jdbc:oracle:thin:@ENTRY_FROM_TNSNAMES";

    Class.forName ("oracle.jdbc.OracleDriver");

    Connection conn = null;
    Statement stmt = null;

    try {
      conn = DriverManager.getConnection(dbURL, "your_user_name", "your_password");

      System.out.println("Connection established");

      stmt = conn.createStatement();

      ResultSet rs = stmt.executeQuery("SELECT dummy FROM dual");

      if (rs.next()) {
        System.out.println(rs.getString(1));
      }
    } catch (SQLException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      if (stmt != null) stmt.close();
      if (conn != null) conn.close();
    }
  }
}

In your tnsnames.ora file, you should have an entry like this:

ENTRY_FROM_TNSNAMES =
  (DESCRIPTION =
    (ADDRESS = (PROTOCOL = TCP)(HOST = myPC)(PORT = 5151))
    (CONNECT_DATA =
      (SERVER = DEDICATED)
