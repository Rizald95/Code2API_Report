Title: How to get list of Integer from String
Question: 
                
my string contains Integer separated by space:

String number = "1 2 3 4 5 "


How I can get list of Integer from this string ?
    
Answer: 
You can use a Scanner to read the string one integer at a time.

Scanner scanner = new Scanner(number);
List<Integer> list = new ArrayList<Integer>();
while (scanner.hasNextInt()) {
    list.add(scanner.nextInt());
}

    
Code: Scanner scanner = new Scanner(number);
List<Integer> list = new ArrayList<Integer>();
while (scanner.hasNextInt()) {
    list.add(scanner.nextInt());
}

Complete the code as a full Java method.

Here is the complete Java method:

```java
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class IntegerListFromString {

    public static List<Integer> getIntegerListFromString(String number) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(number);
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }
        scanner.close();
        return list;
    }

    public static void main(String[] args) {
        String number =