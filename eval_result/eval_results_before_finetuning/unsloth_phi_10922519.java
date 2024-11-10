Title: Java: How to initialize int array in a switch case?
Question: 
                
How can I initialize an integer array in Java like so: int[] array = {1,2,3}; inside a switch statement?

Currently, I can write:

switch(something) {
    case 0: int[] array = {1,2,3}; break;
    default: int[] array = {3,2,1};
}


But when I try to access the array variable, eclipse will complain that it might not be initialized.

If I try to declare it like int[] array; or int[] array = new int[3]; and then have the switch statement, it would say I am trying to redeclare it.

How can I resolve this issue? Final idea is to be able to initialize an array with 10 values in just one line of code, based on some logic (a switch statement).
    
Answer: 
Put the declaration before the switch statement. You will also need to explicitly instantiate an array of the correct type.

int[] array;
switch (something) {
    case 0: array = new int[] {1, 2, 3}; break;
    default: array = new int[] {3, 2, 1};
}

    
Code: int[] array;
switch (something) {
    case 0: array = new int[] {1, 2, 3}; break;
    default: array = new int[] {3, 2, 1};
}

Complete the code as a full Java method.

Here's a complete Java method with the switch statement and array initialization:

```java
public class ArrayInitializer {

    public static void main(String[] args) {
        int something = 0; // This should be set based on your logic
        int[] array;

        switch (something) {
            case 0:
                array = new int[] {1, 2, 3};
                break;
            default:
                array = new int[] {3, 2, 1};
                break;
        }

        // Now you can use the array variable safely
        for (int value : array) {
            System