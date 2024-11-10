Title: How to loop the following code?
Question: 
                
I'm really new to java and I cannot find a way around this. I want to make a program that tells you that a number is either positive or negative, regardless if it is int or double. But after the program is executed, I want it to loop and ask again for input from the user, to execute the code again and again and again, as long as there is user input. Can I do that in java?

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

    
Answer: 
Here is a one of the approach which is good start for you to understand what wonders pattern matching can do in Java and it can be improved by testing it against exhaustive data points.

This also shows how to use while-loop, overloading methods and ternary operator instead of nested if-then-else.

As you are learning, you should also use debugging feature of editors and also use system.out.println to understand what code is doing.

I am ending the program when user presses just enter (without any number).

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String userInput = "Input your number: ";
        System.out.println(userInput);

        while (true) {
            if (in.hasNextInt()) {
                int z = in.nextInt();
                System.out.println(z + " is " + (z > 0 ? "positive." : z == 0 ? "equal to 0." : "negative.") + ".");
            } else if (in.has