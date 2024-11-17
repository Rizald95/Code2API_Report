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

# Answer

You can convert the array to list, remove the element from list and then convert it back to array.

String[] str_array = {"item1","item2","item3"};
List<String> list = new ArrayList<String>(Arrays.asList(str_array));
list.remove("item2");
str_array = list.toArray(new String[0]);

    
Complete the code as a full Java method.

# Answer

You can convert the array to list, remove the element from list and then convert it back to array.

String[] str_array = {"item1","item2","item3"};
