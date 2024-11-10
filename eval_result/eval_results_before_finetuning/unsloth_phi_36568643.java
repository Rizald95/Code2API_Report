public class NumberSequence {

    public static void main(String[] args) {
        String sequence = createNumberSequence(1000);
        System.out.println(sequence);
    }

    public static String createNumberSequence(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(i);
        }
        return sb.toString();
    }
}