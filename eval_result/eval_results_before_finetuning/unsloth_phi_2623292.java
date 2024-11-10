Title: how to take user input in Array using java?
Question: 
                
how to take user input in Array using Java? 
i.e we are not initializing it by ourself in our program but the user is going to give its value..
please guide!!
    
Answer: 
Here's a simple code that reads strings from stdin, adds them into List<String>, and then uses toArray to convert it to String[] (if you really need to work with arrays).

import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Scanner stdin = new Scanner(System.in);

        do {
            System.out.println("Current list is " + list);
            System.out.println("Add more? (y/n)");
            if (stdin.next().startsWith("y")) {
                System.out.println("Enter : ");
                list.add(stdin.next());
            } else {
                break;
            }
        } while (true);
        stdin.close();
        System.out.println("List is " + list);
        String[] arr = list.toArray(new String[0]);
        System.out.println("Array is " + Arrays.toString(arr));
    }
}




See also:


Why is it preferred to use Lists instead of Arrays in Java?
Fill a array with List data

    
Code: import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Scanner stdin = new Scanner(System.in);

        do {
            System.out.println("Current list is " + list);
            System.out.println("Add more? (y/n)");
            if (stdin.next().startsWith("y")) {
                System.out.println("Enter : ");
                list.add(stdin.next());
            } else {
                break;
            }
        } while (true);
        stdin.close();
        System.out.println("List is " + list);
        String[] arr = list.toArray(new String[0]);
        System.out.println("Array is " + Arrays.toString(arr));
    }
}






































































































