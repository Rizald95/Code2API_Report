Title: How to get number of rows returned by Resultset while using HSQLDB?
Question: 
                
I am getting exception feature not supported while getting the total no of rows using ResultSet.last() function.
I tried using the hsqldb specific connection and ResultSet class but no success.

Can some one guide any way to get the no of rows from result set except looping through all the rows.

the code snippet used for getting no of rows is given below:

rs.last();
int total = rs.getRow();
System.out.println("total no of rows in stu are "+total);
rs.beforeFirst()

    
Answer: 
After having look at HSQLDB api ,it can be done same as for ORACLE which is shown below

String URL = "jdbc:oracle:thin:@ip:port:sid";
String USER = "test";
String PASS = "test";
String query = "Select * from mytable";
try {
    Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
    Connection con = DriverManager.getConnection(URL, USER, PASS);
    Statement stmt = con.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY);
    ResultSet rs = stmt.executeQuery(query);
    if (rs.next()) {
        rs.last();
        System.out.println("total rows is : " + rs.getRow());
    } else {
        System.out.println("No Data");
    }
} catch (Exception e) {
    e.printStackTrace();
}

    
Code: String URL = "jdbc:oracle:thin:@ip:port:sid";
String USER = "test";
String PASS = "test";
String query = "Select * from mytable";
try {
    Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
    Connection con = DriverManager.getConnection(URL, USER, PASS);
    Statement stmt = con.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY);
    ResultSet rs = stmt.executeQuery(query);
    if (rs.next()) {
        rs.last();
        System.out.println("total rows is : " + rs.getRow());
    } else {
        System.out.println("No Data");
    }
} catch (Exception e) {
    e.printStackTrace();
}

    
For HSQLDB you can use the below code snippet

String URL = "jdbc:hsqldb:hsql://localhost:9001/testdb";
String USER