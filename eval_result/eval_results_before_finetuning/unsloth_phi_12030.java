
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GatewayFinder {

    public static String findGatewayIP(String destination) throws IOException {
        ProcessBuilder builder = new ProcessBuilder("traceroute", "-m", "1", destination);
        builder.redirectOutput(ProcessBuilder.Redirect.PIPE);

        Process process = builder.start();

       
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            String line = reader.readLine();

         }