package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Human12030 {

  public static String getGatewayIP() throws IOException {
    Process result = Runtime
      .getRuntime()
      .exec("traceroute -m 1 www.amazon.com");

    BufferedReader output = new BufferedReader(
      new InputStreamReader(result.getInputStream())
    );
    String thisLine = output.readLine();
    StringTokenizer st = new StringTokenizer(thisLine);
    st.nextToken();
    String gateway = st.nextToken();
    return gateway;
  }
}
