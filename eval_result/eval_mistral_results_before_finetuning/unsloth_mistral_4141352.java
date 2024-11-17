import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class ByteArrayToString {
    public static void main(String[] args) {
        byte[] byteArray = new byte[] {87, 79, 87, 46, 46, 46};
        String value = new String(byteArray);
        System.out.println(value);
    }

    public static String byteArrayToString(byte[] byteArray) {
        String value = new String(byteArray);
        return value;
    }
}