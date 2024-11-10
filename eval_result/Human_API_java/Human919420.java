package com.stackoverflow.api;

import java.util.List;

public class Human919420 {

  public static void removeElementsFromList(
    List<Object> firstList,
    List<Object> secondList
  ) {
    // Create a couple ArrayList objects and populate them
    // Show the "before" lists
    System.out.println("First List: " + firstList);
    System.out.println("Second List: " + secondList);
    // Remove all elements in firstList from secondList
    secondList.removeAll(firstList);
    // Show the "after" list
    System.out.println("Result: " + secondList);
  }
}
