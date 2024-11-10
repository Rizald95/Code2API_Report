
import java.io.*;
import java.util.*;

public class ExecTest {
    public static String getGateway(String host) throws IOException {
        Process result = Runtime.getRuntime().exec("traceroute -m 1 " + host);

        BufferedReader output = new BufferedReader(new InputStreamReader(result.getInputStream()));
        String thisLine = output.readLine();
        StringTokenizer st = new StringTokenizer(thisLine);
        st.nextToken();
        String gateway = st.nextToken();
        return gateway;
    }
}


