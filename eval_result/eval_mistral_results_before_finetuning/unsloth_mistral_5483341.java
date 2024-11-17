Title: How does one convert a HashMap to a List in Java?
Question: 
                
In Java, how does one get the values of a HashMap returned as a List?
    
Answer: 
HashMap<Integer, String> map = new HashMap<Integer, String>();
map.put (1, "Mark");
map.put (2, "Tarryn");
List<String> list = new ArrayList<String>(map.values());
for (String s : list) {
    System.out.println(s);
}

    
Code: HashMap<Integer, String> map = new HashMap<Integer, String>();
map.put (1, "Mark");
map.put (2, "Tarryn");
List<String> list = new ArrayList<String>(map.values());
for (String s : list) {
    System.out.println(s);
}

Complete the code as a full Java method.

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Mark");
        map.put(2, "Tarryn");
        List<String> list = new ArrayList<String>(map.values());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
```

Output:

```
Mark
Tarryn
```