import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte[] bytes = new byte[100];
        Arrays.fill( bytes, (byte) 0 );
        System.out.println(Arrays.toString(bytes));
    }
}