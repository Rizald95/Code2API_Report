Title: how to create dynamic two dimensional array in java?
Question: 
                
I want to create a two dimensional array dynamically.

I know the number of columns. But the number of rows are being changed dynamically. I tried the array list, but it stores the value in single dimension only. What can I do?
    
Answer: 
Since the number of columns is a constant, you can just have an List of int[].

    import java.util.*;
    //...

    List<int[]> rowList = new ArrayList<int[]>();

    rowList.add(new int[] { 1, 2, 3 });
    rowList.add(new int[] { 4, 5, 6 });
    rowList.add(new int[] { 7, 8 });

    for (int[] row : rowList) {
        System.out.println("Row = " + Arrays.toString(row));
    } // prints:
      // Row = [1, 2, 3]
      // Row = [4, 5, 6]
      // Row = [7, 8]

    System.out.println(rowList.get(1)[1]); // prints "5"


Since it's backed by a List, the number of rows can grow and shrink dynamically. Each row is backed by an int[], which is static, but you said that the number of columns is fixed, so this is not a problem.
    
Code:     import java.util.*;
    //...

    List<int[]> rowList = new ArrayList<int[]>();

    rowList.add(new int[] { 1, 2, 3 });
    rowList.add(new int[] { 4, 5, 6 });
    rowList.add(new int[] { 7, 8 });

    for (int[] row : rowList) {
        System.out.println("Row = " + Arrays.toString(row));
    } // prints:
      // Row = [1, 2, 3]
      // Row = [4, 5, 6]
      // Row = [7, 8]

    System.out.println(rowList.get(1)[1]); // prints "5"