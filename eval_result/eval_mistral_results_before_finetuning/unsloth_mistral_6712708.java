Title: How to count frequency of characters in a string?
Question: 
                
I need to write some kind of loop that can count the frequency of each letter in a string. 
For example: "aasjjikkk" would count 2 'a', 1 's', 2 'j', 1 'i', 3 'k'. Ultimately id like these to end up in a map with the character as the key and the count as the value. Any good idea how to do this? 
    
Answer: 
You can use a java Map and map a char to an int. You can then iterate over the characters in the string and check if they have been added to the map, if they have, you can then increment its value.
For example:
Map<Character, Integer> map = new HashMap<Character, Integer>();
String s = "aasjjikkk";
for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);
    Integer val = map.get(c);
    if (val != null) {
        map.put(c, val + 1);
    }
    else {
       map.put(c, 1);
   }
}

At the end you will have a count of all the characters you encountered and you can extract their frequencies from that.
Alternatively, you can use Bozho's solution of using a Multiset and counting the total occurences.
    
Code: Map<Character, Integer> map = new HashMap<Character, Integer>();
String s = "aasjjikkk";
for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);
    Integer val = map.get(c);
    if (val != null) {
        map.put(c, val + 1);
    }
    else {
       map.put(c, 1);
   }
}

Complete the code as a full Java method.

```
import java.util.*;

public class CountCharFrequency {
    public static Map<Character, Integer> countCharFrequency(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer val = map.get(c);
            if (val != null) {
                map.put(c, val + 1);
            }
            else {
               map.put(c, 1);
            }
        }
        return map;
