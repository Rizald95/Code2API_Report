import java.util.Scanner;

public class GetUserInput {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.

        System.out.println("You entered: " + n);

        reader.close();
    }
}