Title: Map of maps - how to keep the inner maps as maps?
Question: 
                
My goal is to create a map of maps so that I can retrieve info of the outer map by its key and then access its "inner" maps by their keys.  

However, when I got each inner map, the map I created originally became an Object and I cannot use key to access its value as I do with the outer map.

To learn from you experts, I would like to know how to keep all the maps as maps.  Or, is it possible at all?

here is my exercise program:

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {

        Map<Object,String> mp=new HashMap<Object, String>();

        // adding or set elements in Map by put method key and value pair
        mp.put(new Integer(2), "Two");
        mp.put(new Integer(1), "One");
        mp.put(new Integer(3), "Three");
        mp.put(new Integer(4), "Four");

        Map<Object,String> mp2=new HashMap<Object, String>();
        mp2.put(new Integer(2), "Two2");
        mp2.put(new Integer(1), "One2");
        mp2.put(new Integer(3), "Three2");
        mp2.put(new Integer(4), "Four2");

        Map<Object,String> mpMaps=new HashMap();

        mpMaps.put("Map1",mp);
        mpMaps.put("Map2",mp2);

        System.out.println("This is a map of Maps:   " + mpMaps); 

        for (int i=0;i<mpMaps.size();i++){
                     ArrayList a = new ArrayList(mpMaps.keySet());
                     Object o=a.get(i);
                     System.out.println("all together: " + mpMaps.size() + "each element is:  " + o + " and its value is: " + mpMaps.get(o));
        }

        Set<Map.Entry<Object,String>> set = mpMaps.entrySet();
        Iterator<Map.Entry<Object,String>> itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry<Object,String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        System.out.println("Map1: " + mpMaps.get("Map1"));
        System.out.println("Map2