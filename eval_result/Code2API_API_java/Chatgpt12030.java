package com.chatgpt.api;
import java.io.*;
import java.util.*;

public class Chatgpt12030 {
    public static String getGatewayIP() throws IOException {
        Process result = Runtime.getRuntime().exec("traceroute -m 1 www.amazon.com");

        BufferedReader output = new BufferedReader(new InputStreamReader(result.getInputStream()));
        String thisLine = output.readLine();
        StringTokenizer st = new StringTokenizer(thisLine);
        st.nextToken();
        String gateway = st.nextToken();
        return gateway;
    }
}
