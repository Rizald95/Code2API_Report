

    import java.util.Arrays;

    public class Main {
      public static void main(String args[]) {
        byte[] bytes = newOrig();
        System.out.println(Arrays.toString(bytes));
      }
  
      public static byte[] newOrig() {
        byte[] bytes = new byte[100];
        Arrays.fill( bytes, (byte) 1 );
        return bytes;
      }
    }


