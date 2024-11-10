package com.stackoverflow.api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Human27287021 {

  public static String[] getEmpsWithoutCompDefined(
    String[] allEmps,
    String[] listOfEmpsWithCompDefined
  ) {
    Set<String> mySet1 = new HashSet<>(Arrays.asList(allEmps)); // convert to set
    Set<String> mySet2 = new HashSet<>(
      Arrays.asList(listOfEmpsWithCompDefined)
    );
    mySet1.removeAll(mySet2); // elements which are in A but not in B
    return mySet1.toArray(new String[mySet1.size()]); // difference
  }
}
