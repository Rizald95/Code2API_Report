package com.chatgpt.api;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Chatgpt27287021 {
    public static String[] getDifferenceBetweenArrays(String[] allEmps, String[] listOfEmpsWithCompDefined) {
        Set<String> mySet1 = new HashSet<>(Arrays.asList(allEmps)); // convert to set
        Set<String> mySet2 = new HashSet<>(Arrays.asList(listOfEmpsWithCompDefined));
        mySet1.removeAll(mySet2);// elements which are in A but not in B 
        String[] df = mySet1.toArray(new String[mySet1.size()]);// difference 
        return df;
    }
}
