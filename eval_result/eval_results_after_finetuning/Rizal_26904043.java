Title: How to compare two Hash Maps in Java
Question: 
                
Hi I am working with HashMap in java and i have a scenario where i have to compare 2 HashMaps

HashMap1:
Key: BOF   Value: SAPF
Key: BOM   Value: SAPM
Key: BOL   Value: SAPL

HashMap2:
Key: BOF   Value: Data1
Key: BOL   Value: Data2


And after comparing these two hashmaps my resulting hashmap will contain the Key as a Value of First HashMap1 and Value as a Value of second HashMap2.

HashMap3:
Key: SAPF  Value: Data1
Key: SAPL  Value: Data2

    
Answer: 
Just iterate on the keys of HashMap1, and for each key, check if it's present in HashMap2.
If it's present, add the values to HashMap3 :

final Map<String, String> hm1 = new HashMap<String, String>();
hm1.put("BOF", "SAPF");
hm1.put("BOM", "SAPM");
hm1.put("BOL", "SAPL");

final Map<String, String> hm2 = new HashMap<String, String>();
hm2.put("BOF", "Data1");
hm2.put("BOL", "Data2");

final Map<String, String> hm3 = new HashMap<String, String>();

for (final String key : hm1.keySet()) {
    if (hm2.containsKey(key)) {
        hm3.put(hm1.get(key), hm2.get(key));
    }
}

    
Code: final Map<String, String> hm1 = new HashMap<String, String>();
hm1.put("BOF", "SAPF");
hm1.put("BOM", "SAPM");
hm1.put("BOL", "SAPL");

final Map<String, String> hm2 = new HashMap<String, String>();
hm2.put("BOF", "Data1");
hm2.put("BOL", "Data2");

final Map<String, String> hm3 = new HashMap<String, String>();

for (final String key : hm1.keySet()) {
    if (hm2.containsKey(key)) {
        hm3.put(hm1.get(key), hm2.get(key));
    }
}

Complete the code as a full Java method.

# Answer

You can put your code inside a Java method like this:

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hm1 = new HashMap<String, String>();
        hm1.put("BOF