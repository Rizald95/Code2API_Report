Title: how to add value into List<Map<String, Object>>?
Question: 
                
I'm trying to add a value to an ArrayList.

Here is the code I wrote:

List<Map<String, Object>> list = new ArrayList<>();
list.put(1,"foo", (Object)"bar");


But, this does not work. Anybody have an idea?
    
Answer: 
List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
Map<String, Object> map = new HashMap<String, Object>();
map.put("foo", "bar");
list.add(map);

    
Code: List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
Map<String, Object> map = new HashMap<String, Object>();
map.put("foo", "bar");
list.add(map);

Complete the code as a full Java method.

Here is the complete method:

```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("foo", "bar");
        list.add(map);

        // Add more values to the list as needed
        // ...

        // Example of iterating over the list and printing the values
        for (Map<String, Object