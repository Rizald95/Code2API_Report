Title: How to remove elements from an array in java even if we have to iterate over array or can we do it directly? [duplicate]
Question: 
                    
            
        
            
                
                    
                            
                                This question already has answers here:
                                
                            
                    
                
            
                Closed 12 years ago.
        


    


  Possible Duplicates:
  How do I remove objects from an Array in java?
  Removing an element from an Array (Java)  




listOfNames = new String [] {"1","2","3","4"}; //
String [] l = new String [listOfNames.length-1];
for(int i=0; i<listOfNames.length-1; i++)    //removing the first element
   l[i] = listOfNames[i+1];


// can this work , Is there a better way ? to remove certain elements from an array in this case the first one .
    
Answer: 
Without a for loop :

String[] array = new String[]{"12","23","34"};
java.util.List<String> list = new ArrayList<String>(Arrays.asList(array));
list.remove(0);
String[] new_array = list.toArray(new String[0]);


Tip
  If you can, stick with List, you'll have more flexibility.
    
Code: String[] array = new String[]{"12","23","34"};
java.util.List<String> list = new ArrayList<String>(Arrays.asList(array));
list.remove(0);
String[] new_array = list.toArray(new String[0]);

Complete the code as a full Java method.

```
public static String[] removeFirst(String[] array) {
    java.util.List<String> list = new ArrayList<String>(Arrays.asList(array));
    list.remove(0);
    return list.toArray(new String[0]);
}
```

This method takes an array, converts it to a list, removes the first element, and then converts it back to an array.

This method is more flexible than the for loop method because it can remove any element, not just the first one.

This method is also more efficient than the for loop method because it doesn't have to copy the entire array into a new