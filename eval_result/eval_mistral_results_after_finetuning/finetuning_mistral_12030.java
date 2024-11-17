Title: How can I determine the IP of my router/gateway in Java?
Question: 
                
How can I determine the IP of my router/gateway in Java? I can get my IP easily enough. I can get my internet IP using a service on a website. But how can I determine my gateway's IP?

This is somewhat easy in .NET if you know your way around. But how do you do it in Java?
    
Answer: 
Java doesn't make this as pleasant as other languages, unfortunately. Here's what I did:

import java.io.*;
import java.util.*;

public class ExecTest {
    public static void main(String[] args) throws IOException {
        Process result = Runtime.getRuntime().exec("traceroute -m 1 www.amazon.com");

        BufferedReader output = new BufferedReader(new InputStreamReader(result.getInputStream()));
        String thisLine = output.readLine();
        StringTokenizer st = new StringTokenizer(thisLine);
        st.nextToken();
        String gateway = st.nextToken();
        System.out.printf("The gateway is %s\n", gateway);
    }
}


This presumes that the gateway is the second token and not the third. If it is, you need to add an extra st.nextToken(); to advance the tokenizer one more spot.
    
Code: import java.io.*;
import java.util.*;

public class ExecTest {
    public static void main(String[] args) throws IOException {
        Process result = Runtime.getRuntime().exec("traceroute -m 1 www.amazon.com");

        BufferedReader output = new BufferedReader(new InputStreamReader(result.getInputStream()));
        String thisLine = output.readLine();
        StringTokenizer st = new StringTokenizer(thisLine);
        st.nextToken();
        String gateway = st.nextToken();
        System.out.printf("The gateway is %s\n", gateway);
    }
}

Complete the code as a full Java method.

# Answer

You can use the following code as a full Java method.

import java.io.*;
import java.util.*;

public String getGateway() {
    Process p;
    String s;
    try {
        p = Runtime.getRuntime().exec("route -n");
        BufferedReader rd = new BufferedReader(new InputStreamReader(p.getInputStream()));
        s = rd.readLine();
        StringTokenizer st = new StringTokenizer(s, "\t");
        String gateway = st.nextToken();
        String network = st.nextToken();
        String interface = st.nextToken();
