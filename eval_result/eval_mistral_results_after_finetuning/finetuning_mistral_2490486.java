Title: How to use java.Set
Question: 
                
I'm trying to make it working for quite some time,but just can't seem to get it. I have object Tower built of Block's. I've already made it working using arrays, but I wanted to learn Set's. I'd like to get similar functionality to this:

public class Tower {


public Tower(){
}

public Tower add(Block k1){

    //(...)
    //if block already in tower, return "Block already in tower"
}

public Tower delete(Block k1){

    //(...)
    //if block already dleted, show "No such block in tower"
}

}


Someone gave me some code, but I constantly get errors when trying to use it :

Set<Block> tower = new HashSet<Block>();

boolean added = tower.add( k1 );
if( added ) {
System.out.println("Added 1 block.");
} else {
System.out.println("Tower already contains this block.");
}


How to implement it ?
    
Answer: 
The first thing you need to study is the java.util.Set API.

Here's a small example of how to use its methods:

    Set<Integer> numbers = new TreeSet<Integer>();

    numbers.add(2);
    numbers.add(5);

    System.out.println(numbers); // "[2, 5]"
    System.out.println(numbers.contains(7)); // "false"

    System.out.println(numbers.add(5)); // "false"
    System.out.println(numbers.size()); // "2"

    int sum = 0;
    for (int n : numbers) {
        sum += n;
    }
    System.out.println("Sum = " + sum); // "Sum = 7"

    numbers.addAll(Arrays.asList(1,2,3,4,5));
    System.out.println(numbers); // "[1, 2, 3, 4, 5]"

    numbers.remove(2);
    System.out.println(numbers); // "[1, 3, 4, 5]"

    
You can use the TreeSet if you want to store the blocks in a sorted way.

    
Code: Set<Block> tower = new TreeSet<Block>();

boolean added = tower.add( k1 );
if( added ) {
System.out.println("Added 1 block.");
} else {
System.out.println("Tower already contains this block.");
}


Complete the code as a full Java method.

# Answer

You can use the code you have as a start. Here is