public class StringChecker {

    public static void main(String[] args) {
        String input = "abq"; // Example input
        if(!input.matches("[abc]+")) {
            System.out.println("The string you entered has some incorrect characters");
        } else {
            System.out.println("The string is valid.");
        }
    }
}