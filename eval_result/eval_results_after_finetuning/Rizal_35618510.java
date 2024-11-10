    
package homeWork;

public class ShoppingBag {

private int items;
private float totalRetailCost;
private float taxRate;

public ShoppingBag(float taxRate){
    this.taxRate = taxRate;
    items = 0;
    totalRetailCost = 0.0f;
}

// Transformer
public void place(int numItems, float theCost){
    items = items += numItems;
    totalRetailCost += (numItems * theCost);
}

public int getItems(){
    return items; 
}

public float getRetailCost(){
    return totalRetailCost;
}

public float getTotalCost(){
    return totalRetailCost + (1 + taxRate);
}

public String toString(){
    String result = "The bag contains " + items + " items";
           result += "The retail cost of items is" + totalRetailCost;
           result += "The total cost = " + getTotalCost();
    return result;

    }
}

package homeWork;

import java.util.*;

 public class MainClass {

public static void main(String[] args){
    Scanner conIn = new Scanner(System.in);
    ShoppingBag sb = new ShoppingBag(0.06f);
    int count = 0;
    float cost = 0.0f;
    System.out.print("Enter count (0 to stop):");
    count = conIn.nextInt();

    while(count != 0){
        System.out.print("Enter cost: ");
        cost = conIn.nextFloat();
        sb.place(count, cost);
        System.out.print("Enter count (0 to stop):");
        count = conIn.nextInt();
    }
}

}
