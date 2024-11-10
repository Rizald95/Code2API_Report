
                
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



Exception in thread "main" java.util.InputMismatchException
    at java.util.Scanner.throwFor(Unknown Source)
    at java.util.Scanner.next(Unknown Source)
    at java.util.Scanner.nextInt(Unknown Source)
    at java.util.Scanner.nextInt(Unknown Source)
    at com.controller.Menu.<init>(Menu.java:61)
    at com.tests.Employeetest.main(Employeetest.java:17)



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

