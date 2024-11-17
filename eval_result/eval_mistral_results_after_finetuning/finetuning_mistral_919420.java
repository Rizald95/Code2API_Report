Title: How can I calculate the difference between two ArrayLists?
Question: 
                
I have two ArrayLists.

ArrayList A contains:

['2009-05-18','2009-05-19','2009-05-21']


ArrayList B contains:

['2009-05-18','2009-05-18','2009-05-19','2009-05-19','2009-05-20','2009-05-21','2009-05-21','2009-05-22']


I have to compare ArrayList A and ArrayList B. The result ArrayList
 should contain the  List which does not exist in ArrayList A.

ArrayList result should be:

['2009-05-20','2009-05-22']


how to compare ?
    
Answer: 
In Java, you can use the Collection interface's removeAll method.

// Create a couple ArrayList objects and populate them
// with some delicious fruits.
Collection firstList = new ArrayList() {{
    add("apple");
    add("orange");
}};

Collection secondList = new ArrayList() {{
    add("apple");
    add("orange");
    add("banana");
    add("strawberry");
}};

// Show the "before" lists
System.out.println("First List: " + firstList);
System.out.println("Second List: " + secondList);

// Remove all elements in firstList from secondList
secondList.removeAll(firstList);

// Show the "after" list
System.out.println("Result: " + secondList);


The above code will produce the following output:

First List: [apple, orange]
Second List: [apple, orange, banana, strawberry]
Result: [banana, strawberry]

    
Code: // Create a couple ArrayList objects and populate them
// with some delicious fruits.
Collection firstList = new ArrayList() {{
    add("apple");
    add("orange");
}};

Collection secondList = new ArrayList() {{
    add("apple");
    add("orange");
    add("banana");
    add("strawberry");
}};

// Show the "before" lists
System.out.println("First List: " + firstList);
System.out.println("Second List: " + secondList);

// Remove all elements in firstList from secondList
secondList.removeAll(firstList);

// Show the "after" list
System.out.println("Result: " + secondList);


Complete the code as a full Java method.