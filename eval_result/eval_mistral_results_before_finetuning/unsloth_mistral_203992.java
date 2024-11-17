Title: How do I remove repeated elements from ArrayList?
Question: 
                
I have an ArrayList<String>, and I want to remove repeated strings from it. How can I do this?
    
Answer: 
If you don't want duplicates in a Collection, you should consider why you're using a Collection that allows duplicates. The easiest way to remove repeated elements is to add the contents to a Set (which will not allow duplicates) and then add the Set back to the ArrayList:

Set<String> set = new HashSet<>(yourList);
yourList.clear();
yourList.addAll(set);


Of course, this destroys the ordering of the elements in the ArrayList.
    
Code: Set<String> set = new HashSet<>(yourList);
yourList.clear();
yourList.addAll(set);

Complete the code as a full Java method.

```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");
        list.add("apple");

        List<String> uniqueList = removeDuplicates(list);
        System.out.println(uniqueList);
    }

    public static List