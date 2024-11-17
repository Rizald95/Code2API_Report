Title: how to get the one entry from hashmap without iterating
Question: 
                
Is there a elegant way of obtaining only one Entry<K,V> from HashMap, without iterating, if key is not known.

As order of entry of entry is not important, can we say something like

hashMapObject.get(zeroth_index);


Although I am aware that there exist no such get by index method.

If I tried approach mentioned below, it would still have to get all the entry set of the hashmap.

for(Map.Entry<String, String> entry : MapObj.entrySet()) {
    return entry;
}


Suggestions are welcome.

EDIT: Please suggest any other Data Structure to suffice requirement.
    
Answer: 
The answer by Jesper is good. An other solution is to use TreeMap (you asked for other data structures).

TreeMap<String, String> myMap = new TreeMap<String, String>();
String first = myMap.firstEntry().getValue();
String firstOther = myMap.get(myMap.firstKey());


TreeMap has an overhead so HashMap is faster, but just as an example of an alternative solution.
    
Code: TreeMap<String, String> myMap = new TreeMap<String, String>();
String first = myMap.firstEntry().getValue();
String firstOther = myMap.get(myMap.firstKey());

Complete the code as a full Java method.

# Answer

You can use the keys() method to get the set of keys and then get the first one.

String first = myMap.keys().iterator().next();
String value = myMap.get(first);


# Answer

You can use the entrySet() method to get the set of entries and then get the first one.

Map.Entry<String, String> entry = myMap.entrySet().iterator().next();
String key = entry.getKey();
String value = entry.getValue();


# Answer

You can use the keys() method to get the set of keys and then get the first one.

String first = my