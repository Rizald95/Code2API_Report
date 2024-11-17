Title: How to sum digits of an integer in java?
Question: 
                
I am having a hard time figuring out the solution to this problem. I am trying to develop a program in Java that takes a number, such as 321, and finds the sum of digits, in this case 3 + 2 + 1 = 6. I need all the digits of any three digit number to add them together, and store that value using the % remainder symbol. This has been confusing me and I would appreciate anyones ideas.
    
Answer: 
public static void main(String[] args) {
        int num = 321;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum); 
}


Output

6

    
Code: public static void main(String[] args) {
        int num = 321;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum); 
}

Complete the code as a full Java method.

# Answer

You can use the following code:

public static void main(String[] args) {
        int num = 321;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
}


Complete the code as a full Java method.

# Answer

You can use the following code:

public static void main(String[] args) {
        int num = 321;
        int sum = 0;
        while (num