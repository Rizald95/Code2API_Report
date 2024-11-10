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

# Answer

You can convert the array to a list, remove the item at the specified index, and convert it back to an array.

Complete the code as a full Java method:

public String[] removeFromArray(String[] array, int index) {
    java.util.List<String> list = new ArrayList<String>(Arrays.asList(array));
    list.remove(index);
    return list.toArray(new String[0]);
}

Complete the whole Java method as a full Java class:

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main