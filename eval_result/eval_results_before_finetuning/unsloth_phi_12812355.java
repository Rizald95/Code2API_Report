Title: How to remove specific value from string array in java? [duplicate]
Question: 
                    
            
        
            
                
                    
                            
                                This question already has answers here:
                                
                            
                    
                
            
                Closed 10 years ago.
        


    


  Possible Duplicate:
  Removing an element from an Array (Java)  




How to remove specific String array value for example  

String[] str_array = {"item1","item2","item3"};   

i want to remove "item2" from str_array pls help me i want output like   

String[] str_array = {"item1","item3"};
    
Answer: 
I would do it as follows:

String[] str_array = {"item1","item2","item3"};
List<String> list = new ArrayList<String>(Arrays.asList(str_array));
list.remove("item2");
str_array = list.toArray(new String[0]);

    
Code: String[] str_array = {"item1","item2","item3"};
List<String> list = new ArrayList<String>(Arrays.asList(str_array));
list.remove("item2");
str_array = list.toArray(new String[0]);

Complete the code as a full Java method.

Here's a complete Java method that removes a specific value from a string array:

```java
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class RemoveValueFromArray {

    public static String[] removeValueFromArray(String[] array, String valueToRemove) {
        // Convert the array to a list
        List<String> list = new ArrayList<String>(Arrays.asList(array));
        
        // Remove the specified value from the list
        list.remove(valueToRemove);
        
        // Convert the list back to an array
        return list.toArray