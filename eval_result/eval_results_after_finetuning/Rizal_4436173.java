Title: How to connect to local host using JDBC?
Question: 
                
I installed MySql on my own machine. I created database, create table, ... using MySql CommandLine Client. When working on a project in school, I connected to school's database using this syntax:

public static Statement connect() {
  try {
   Class.forName( "com.mysql.jdbc.Driver" ).newInstance();
   conn = DriverManager.getConnection( "1", "2", "3" );
   stmt = conn.createStatement();
  }
  catch( Exception e ) {
   System.out.println( "Connection Error:  " + e );
  }
  return stmt;
 }


In my local machine, I don't have to type in user name, all I did is just login with my password as root user:

Enter password: ****
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 1
Server version: 5.1.53-community MySQL Community Server (GPL)

Copyright (c) 2000, 2010, Oracle and/or its affiliates. All rights reserved.
This software comes with ABSOLUTELY NO WARRANTY. This is free software,
and you are welcome to modify and redistribute it under the GPL v2 license

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use chandb;
Database changed
mysql> show tables;
+------------------+
| Tables_in_chandb |
+------------------+
| another          |
| cars             |
| employees        |
+------------------+
3 rows in set (0.03 sec)

mysql> select * from Another;
+----+-----------+----------+
| Id | GoldValue | Model    |
+----+-----------+----------+
|  0 |       100 | Civic DX |
+----+-----------+----------+
1 row in set (0.00 sec)

mysql>


I would like to know how can I connect to my local machine's database? what should I put in the DriverManager.getConnection() method?

Updates:

I tried to put "localhost" as the first parameter in the DriverManager.getConnection() method:

Exception java.sql.SQLException: No suitable driver found for localhost

Any idea?
Answer: 

You need to load the JDBC driver before you call DriverManager.getConnection() method. You can load the driver using Class.forName() method:

Class.forName("com.mysql.jdbc.Driver");


Complete the code as a full Java method:

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;