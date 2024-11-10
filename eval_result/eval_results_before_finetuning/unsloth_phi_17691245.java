Title: How to read strings from a Scanner in a Java console application?
Question: 
                
import java.util.Scanner;
class MyClass
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int employeeId, supervisorId;
        String name;
        System.out.println("Enter employee ID:");
        employeeId = scanner.nextInt();
        System.out.println("Enter employee name:");
        name = scanner.next();
        System.out.println("Enter supervisor ID:");
        supervisorId = scanner.nextInt();
    }
}


I got this exception while trying to enter a first name and last name.

Enter employee ID:
101
Enter employee name:
firstname lastname
Enter supervisor ID:
Exception in thread "main" java.util.InputMismatchException
    at java.util.Scanner.throwFor(Unknown Source)
    at java.util.Scanner.next(Unknown Source)
    at java.util.Scanner.nextInt(Unknown Source)
    at java.util.Scanner.nextInt(Unknown Source)
    at com.controller.Menu.<init>(Menu.java:61)
    at com.tests.Employeetest.main(Employeetest.java:17)


but its working on if I only enter the first name.

Enter employee ID:
105
Enter employee name:
name
Enter supervisor ID:
501


What I want is to read the full string whether it is given as name or as firstname lastname. What's the problem here?
    
Answer: 
Scanner scanner = new Scanner(System.in);
int employeeId, supervisorId;
String name;
System.out.println("Enter employee ID:");
employeeId = scanner.nextInt();
scanner.nextLine(); //This is needed to pick up the new line
System.out.println("Enter employee name:");
name = scanner.nextLine();
System.out.println("Enter supervisor ID:");
supervisorId = scanner.nextInt();

The problem you are facing is that when you use scanner.next() to read a string, it only reads the next token (i.e., the part of the input separated by whitespace) and leaves the rest of the input on the buffer. So, when you try to read the next integer, it throws an InputMismatchException because it expects an integer but finds a string.

To solve this, you can use scanner.nextLine() to read the entire line as a string. Then, if you want to extract the integer from the string, you can use Integer.parseInt(string).

Here, I added scanner.nextLine() after reading the employee name to consume the rest of the