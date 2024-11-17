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


Try the code as a full Java method.

# Answer

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


Try the code as a full Java method.
