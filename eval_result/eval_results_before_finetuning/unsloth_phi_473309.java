public class ZeroPadInteger {

    public static String padIntegerWithZeros(int number) {
        return String.format("%05d", number);
    }

    public static void main(String[] args) {
        // Example usage:
        int myNumber = 42;
        String paddedNumber = padIntegerWithZeros(myNumber);
        System.out.println("Padded number: " + paddedNumber);
    }
}