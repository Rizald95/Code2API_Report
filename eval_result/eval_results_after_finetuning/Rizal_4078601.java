Title: How to avoid ConcurrentModificationException when iterating over a map and changing values?
Question: 
                
I've got a map containing some keys (Strings) and values (POJOs)

I want to iterate through this map and alter some of the data in the POJO.

The current code I've inherited removes the given entry, and adds it back in after making some changes to the POJO.

This doesn't work well, since you shouldn't be modifying a map whilst your iterating through it (method is synchronised, but ConcurrentModificationException still appears)

My question is, if I need to iterate over a map and change values, what are the best practices/methods I can use for doing so? To create a separate map and build that up as I go, then return the copy?
    
Answer: 
Two options:

Option 1


  The current code I've inherited removes the given entry, and adds it back in after making some changes to the POJO.


Are you changing the reference to the POJO? E.g., so the entry points to something else entirely? Because if not, there's no need to remove it from the map at all, you can just change it.

Option 2

If you do need to actually change the reference to the POJO (e.g., the value of the entry), you can still do that in place by iterating over the Map.Entry instances from entrySet(). You can use setValue on the entry, which doesn't modify what you're iterating over.

Example:

Map<String,String>                  map;
Map.Entry<String,String>            entry;
Iterator<Map.Entry<String,String>>  it;

// Create the map
map = new HashMap<String,String>();
map.put("one", "uno");
map.put("two", "due");
map.put("three", "tre");

// Iterate through the entries, changing one of them
it = map.entrySet().iterator();
while (it.hasNext())
{
    entry = it.next();
    System.out.println("Visiting " + entry.getKey());
    if (entry.getKey().equals("two"))
    {
        entry.setValue("dd");
   0


Complete the example as a full Java method.

# Answer
You can iterate over the map entries and change the values in place using the `setValue` method on the `Map.Entry` object. Here is the complete Java method as an example:

```java
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map