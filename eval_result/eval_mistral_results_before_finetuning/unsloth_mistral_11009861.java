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

```
public List<Integer> getListOfIntegers(String number) {
    Scanner scanner = new Scanner(number);
    List<Integer> list = new ArrayList<Integer>();
    while (scanner.hasNextInt()) {
        list.add(scanner.nextInt());
    }
    return list;
}
```

This method takes a string as input, creates a Scanner object to read the string, and creates a new ArrayList to store the integers. It then loops through the string, adding each integer to the list using the `nextInt()` method of the Scanner object. Finally, it returns the list of inte