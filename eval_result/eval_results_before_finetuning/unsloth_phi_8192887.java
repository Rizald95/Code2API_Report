Title: How to search for a string in an arraylist
Question: 
                
I want to search for a string in an arraylist.
My ArrayList contains: 

ArrayList <String> list = new ArrayList(); 
list.add("behold");
list.add("bend");
list.add("bet");
list.add("bear");
list.add("beat");
list.add("become");
list.add("begin");


Now I want to search for "bea" and it should return a list containing "bear" and "beat".
How can I implement it?
    
Answer: 
 List <String> list = new ArrayList();  
           list.add("behold"); 
           list.add("bend"); 
           list.add("bet"); 
           list.add("bear"); 
           list.add("beat"); 
           list.add("become"); 
           list.add("begin");

           List <String> listClone = new ArrayList<String>(); 
           for (String string : list) {
               if(string.matches("(?i)(bea).*")){
                   listClone.add(string);
               }
           }
        System.out.println(listClone);

    
Code:  List <String> list = new ArrayList();  
           list.add("behold"); 
           list.add("bend"); 
           list.add("bet"); 
           list.add("bear"); 
           list.add("beat"); 
           list.add("become"); 
           list.add("begin");

           List <String> listClone = new ArrayList<String>(); 
           for (String string : list) {
               if(string.matches("(?i)(bea).*")){
                   listClone.add(string);
               }
           }
        System.out.println(listClone);

Complete the code as a full Java method.


Answer:

Here is a Java method that searches for a string containing "bea" in an ArrayList of strings and returns a new ArrayList containing the matching strings:

```java
import java.util.ArrayList;
import java.util.List;

public class StringSearch {

    public static List<String> searchForBea(List<String> list) {
        List<String> listClone = new ArrayList<String>();
        for (String string : list) {
            if (string.toLowerCase().startsWith("bea")) {
                listClone.add(string);
            }
        }
        return listClone;