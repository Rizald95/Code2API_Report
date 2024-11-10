Title: how to remove duplicate value from hash map [closed]
Question: 
                    
            
        
            
                
                    
                            
                                Closed. This question does not meet Stack Overflow guidelines. It is not currently accepting answers.
                                
                            
                    
                
            
        
            
        
            
                
                        
                            
                        
                     This question appears to be off-topic because it lacks sufficient information to diagnose the problem. Describe your problem in more detail or include a minimal example in the question itself.
                
                    
                        Closed 9 years ago.
                    
                

                
            
        
            
                    
                        Improve this question
                    
            


    

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyClass {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Anil");
        hm.put(2, "Deven");
        hm.put(3, "sanjay");
        hm.put(4, "sanjay");
        hm.put(5, "Raj");
        hm.put(6, "sanjay");

        Set<Integer> keys = hm.keySet();

    }

}


This my code i want to remove all duplicate value from hash-map and want print on console please tell me how i will do this .
    
Answer: 
Your HashMap is hm. Put the values of hm in another HashMap hm2 in which the values of hm are the keys of hm2, and the values of hm2 can be anything (e.g. the object Boolean.TRUE).

Then loop through that second HashMap, and print the keys of hm2.

Here's the code:

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyClass {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Anil");
        hm.put(2, "Deven");
        hm.put