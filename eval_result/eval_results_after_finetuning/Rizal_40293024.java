
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream csvOS = new ByteArrayOutputStream();
        PrintStream printer = new PrintStream(csvOS);
        printer.println("L1C1;L1C2;L1C3");
        printer.println("L2C1;L2C2;L2C3");
        printer.close();

        System.out.println(csvOS.toString());
    }
}