public class StringTrimmer {

    public static String trimString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        return input.trim();
    }

    public static void main(String[] args) {
        String s = "          Hello World                    ";
        String result = trimString(s);
        System.out.println(result); // Output: "Hello World"
    }
}