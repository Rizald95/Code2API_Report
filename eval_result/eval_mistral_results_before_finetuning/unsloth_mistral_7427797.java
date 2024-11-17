Title: How to use SortedMap interface or TreeMap in Java?
Question: 
                
I have a
 Map<Float, MyObject>

What is the best way to keep the map sorted according to the float?
Is SortedMap or TreeMap the best answer?
How do I use it?
I only create the map once and replace the MyObject frequently using myMap.put() and myMap.get().
    
Answer: 
I would use TreeMap, which implements SortedMap. It is designed exactly for that.

Example:

Map<Integer, String> map = new TreeMap<Integer, String>();

// Add Items to the TreeMap
map.put(1, "One");
map.put(2, "Two");
map.put(3, "Three");

// Iterate over them
for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " => " + entry.getValue());
}


See the Java tutorial page for SortedMap.
And here a list of tutorials related to TreeMap.
    
Code: Map<Integer, String> map = new TreeMap<Integer, String>();

// Add Items to the TreeMap
map.put(1, "One");
map.put(2, "Two");
map.put(3, "Three");

// Iterate over them
for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " => " + entry.getValue());
}

Complete the code as a full Java method.

```
import java.util.Map;
import java.util.TreeMap;

public class SortedMapExample {

    public static void main(String[] args) {
        Map<Float, MyObject> myMap = new TreeMap<Float, MyObject>();

        // Add Items to the TreeMap
        myMap.put(1.0f, new MyObject("One"));
        myMap.put(2.0f, new MyObject("Two"));
        myMap.put(3.0f, new MyObject("Three"));

        // Iterate over them
        for (Map.Entry<Float, MyObject>