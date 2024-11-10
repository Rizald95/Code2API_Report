Title: In java, how would I find the nth Fibonacci number?
Question: 
                
Determining the Fibonacci sequence is easy enough to figure out:

int num = 0;
int num2 = 1;
int loop;
int fibonacci;
System.out.print(num2);
for (loop = 1; loop <= 10; loop ++)
{
    fibonacci = num + num2;
    num = num2;
    num2 = fibonacci;
    System.out.print(" " + fibonacci);
}


My problem lies with trying to pinpoint the value for a specified N. As in, If I want to find the 6th element in the sequence, which is 8, how would I find that number, and only that number?
    
Answer: 
In your code, num starts as the 0th Fibonacci number, and num1 as the 1st. So to find the nth, you have to iterate the step n times:

for (loop = 0; loop < n; loop ++)
{
    fibonacci = num + num2;
    num = num2;
    num2 = fibonacci;
}
System.out.print(num);


and only print it when you've finished.

When the loop counter loop has the value k, num holds the kth Fibonacci number and num2 the (k+1)th.
    
Code: for (loop = 0; loop < n; loop ++)
{
    fibonacci = num + num2;
    num = num2;
    num2 = fibonacci;
}
System.out.print(num);

Complete the code as a full Java method.

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position of the Fibonacci number you want to find: ");
        int n = scanner.nextInt();
        System.out.println(nthFibonacci(n));
    }

    public static int nthFibonacci(int n) {
        int num = 0;
        int num2 = 1;
        int fibonacci;
        for (int loop = 0;