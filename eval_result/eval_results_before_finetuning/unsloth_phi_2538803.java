public class PrintFloat {

    public static void main(String[] args) {
        float val = 123.456f;
        printFloatWithTwoDecimalPlaces(val);
    }

    public static void printFloatWithTwoDecimalPlaces(float val) {
        System.out.printf("%.2f", val);
    }
}