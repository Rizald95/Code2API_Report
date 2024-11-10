import java.util.Scanner;

public class FibonacciFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the position of Fibonacci number you want to find: ");
        int n = scan.nextInt();
        System.out.println("The Fibonacci number at position " + n + " is: " + fibonacci(n));
    }

    // Method to find nth Fibonacci number
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int fnum1 = 0; // 0th Fibonacci number
        int fnum2 = 1; // 1st Fibonacci number
        int fibonacci = 0;

        for (int i = 2; i <= n; i++) {
            fibonacci = fnum1 + fnum2;
            fnum1 = fnum2;
            fnum2 = fibonacci;
        }

        return fibonacci; // Returns the nth Fibonacci number
    }
}
