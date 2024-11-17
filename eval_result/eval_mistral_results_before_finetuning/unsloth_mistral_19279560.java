Title: How do I use the new computeIfAbsent function?
Question: 
                
I very much want to use Map.computeIfAbsent but it has been too long since lambdas in undergrad.  

Almost directly from the docs: it gives an example of the old way to do things:

Map<String, Boolean> whoLetDogsOut = new ConcurrentHashMap<>();
String key = "snoop";
if (whoLetDogsOut.get(key) == null) {
  Boolean isLetOut = tryToLetOut(key);
  if (isLetOut != null)
    map.putIfAbsent(key, isLetOut);
}


And the new way:

map.computeIfAbsent(key, k -> new Value(f(k)));


But in their example, I think I'm not quite "getting it."  How would I transform the code to use the new lambda way of expressing this?
    
Answer: 
Suppose you have the following code:

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    public static void main(String[] s) {
        Map<String, Boolean> whoLetDogsOut = new ConcurrentHashMap<>();
        whoLetDogsOut.computeIfAbsent("snoop", k -> f(k));
        whoLetDogsOut.computeIfAbsent("snoop", k -> f(k));
    }
    static boolean f(String s) {
        System.out.println("creating a value for \""+s+'"');
        return s.isEmpty();
    }
}


Then you will see the message creating a value for "snoop" exactly once as on the second invocation of computeIfAbsent there is already a value for that key. The k in the lambda expression k -> f(k) is just a placeolder (parameter) for the key which the map will pass to your lambda for computing the value. So in the example the key is passed to the function invocation.

Alternatively you could write: whoLetDogsOut.computeIfAbsent("snoop", k -> k.isEmpty()); to achieve the same result.