Title: How can I display all the HTTP Headers when using the DefaultHTTPClient?
Question: 
                
When using the DefaultHttpClient() from the Apache Commons HTTP Client, is it possible to show the full request in the console output for debugging purposes?

I'm having issues with my application and I feel that the easiest way to debug it it would be to inspect all data sent by the DefaultHTTPClient.
    
Answer: 
From another answer on StackOverflow. This can easily be done by enabling the debug logging for the Apache HTTP Client:

java.util.logging.Logger.getLogger("org.apache.http.wire").setLevel(java.util.logging.Level.FINEST);
java.util.logging.Logger.getLogger("org.apache.http.headers").setLevel(java.util.logging.Level.FINEST);

System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.SimpleLog");
System.setProperty("org.apache.commons.logging.simplelog.showdatetime", "true");
System.setProperty("org.apache.commons.logging.simplelog.log.httpclient.wire", "debug");
System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.http", "debug");
System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.http.headers", "debug");

    
Code: java.util.logging.Logger.getLogger("org.apache.http.wire").setLevel(java.util.logging.Level.FINEST);
java.util.logging.Logger.getLogger("org.apache.http.headers").setLevel(java.util.logging.Level.FINEST);

System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.SimpleLog");
System.setProperty("org.apache.commons.logging.simplelog.showdatetime", "true");
System.setProperty("org.apache.commons.logging.simplelog.log.httpclient.wire", "debug");
System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.http", "debug");
System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.http.headers", "debug");

Complete the code as a full Java method.

# Answer

You can complete the code as a full Java method.

# Answer

You can complete the code as a full Java method.

java.util.logging.Logger.getLogger("org.apache.http.wire").setLevel(java.util.logging.Level.FINEST);
java.util.logging.Logger.getLogger("org.apache.http.headers").setLevel(java.util.logging.Level.FINE