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

Here's a complete Java method that counts the frequency of each character in a given string and returns a map with the characters as keys and their frequencies as values:

```java
import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCounter {

    public static Map<Character, Integer> countCharacterFrequencies(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            // Increment the count for the character in the map
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1