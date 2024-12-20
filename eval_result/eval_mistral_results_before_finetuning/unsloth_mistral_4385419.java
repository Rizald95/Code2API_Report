Title: How to connect Java to Mysql? [duplicate]
Question: 
                    
            
        
            
                
                    
                            
                                This question already has answers here:
                                
                            
                    
                
            
                    
                        Connect Java to a MySQL database
                            
                                (14 answers)
                            
                    
                Closed 8 years ago.
        


    

I got these errors for my Java program. I have already put the mysql-connector-java-5.1.14-bin.jar inside my classpath. How to solve this?    

HSystemRDB.java:144: package com.mysql.jdbc does not exist
    Driver driver = new com.mysql.jdbc.Driver();
                                      ^
HTestClassRDB.java:99: package com.mysql.jdbc does not exist
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());


The code:

    String url = "jdbc:mysql://wire:3306/h?user="+pSystemRDB.USERNAME+"&password="+pSystemRDB.PASSWORD;
    Connection con;
    Statement stmt;
    String query1 = "Delete from dbase";
    String query2 = "Delete from id";


    try {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
    } catch (Exception e) {
        System.out.println("Class Not Found Exception:");
        System.out.println(e.getMessage());
    }

    
Answer: 
You need to download the mysql package from: here and place it inside the library, i'll edit the excact steps in a few min

this is the correct syntax to connect to a database:

try
{
  // create a java mysql database connection
  String myDriver = "org.gjt.mm.mysql.Driver";
  String myUrl = "jdbc:mysql://localhost/test";
  Class.forName(myDriver);
  Connection conn = DriverManager.getConnection(myUrl, "root", "password");
  Statement stmt = conn.createStatement();
  String sql = "SELECT * FROM test";
  ResultSet rs = stmt.executeQuery(sql);
  while (rs.next()) {
    System.out.println("ID: " + rs.getInt("id"));
    System.out.println("Name: " + rs.getString("name"));
  }
  conn.close();
} catch (Exception e) {
  System.out.println("Error: " + e);
}

You can also use the following code to connect to a database: