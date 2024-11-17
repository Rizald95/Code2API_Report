Title: How do I create an int array with randomly shuffled numbers in a given range [duplicate]
Question: 
                    
            
        
            
                
                    
                            
                                This question already has answers here:
                                
                            
                    
                
            
                    
                        Random shuffling of an array
                            
                                (31 answers)
                            
                    
                Closed 2 years ago.
        


    

Basically, let's say I have an int array that can hold 10 numbers. Which mean I can store 0-9 in each of the index (each number only once).
If I run the code below:
int[] num = new int[10];
for(int i=0;i<10;i++){
    num[i]=i;
}

my array would look like this:
[0],[1],.....,[8],[9]

But how do I randomize the number assignment each time I run the code?
For example, I want the array to look something like:
[8],[1],[0].....[6],[3]

    
Answer: 
Make it a List<Integer> instead of an array, and use Collections.shuffle() to shuffle it. You can build the int[] from the List after shuffling.

If you really want to do the shuffle directly, search for "Fisher-Yates Shuffle".

Here is an example of using the List technique:

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
  public static void main(String args[]) {
    List<Integer> dataList = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      dataList.add(i);
    }
    Collections.shuffle(dataList);
    int[] num = new int[dataList.size()];
    for (int i = 0; i < dataList.size(); i++) {
      num[i] = dataList.get(i);
    }
    System.out.println(num);
  }
}

Complete the code as a full Java method.

# Answer

You can use Collections.shuffle() on a List<Integer>. Here is a full Java method.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomNumber {
    public static void main(String args[]) {
        List<Integer> dataList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            data