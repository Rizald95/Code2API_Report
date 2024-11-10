
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String userInput = "Input your number: ";
        System.out.println(userInput);

        if (in.hasNextInt()) {
            int z = in.nextInt();
            if (z > 0) {
                System.out.println(z + " is positive.");
            } else if (z < 0) {
                System.out.println(z + " is negative.");
            } else {
                System.out.println(z + " is equal to 0.");
            }
        } else if (in.hasNextDouble()) {
            double x = in.nextDouble();
            if (x > 0) {
                System.out.println(x + " is positive.");
            } else if (x < 0) {
                System.out.println(x + " is negative.");
            } else {
                System.out.println(x + " is equal to 0.");
            }
        } else {
            System.out.println("Hey! Only numbers!");
        }
    }
}

    
