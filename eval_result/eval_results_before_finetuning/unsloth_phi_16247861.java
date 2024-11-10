Title: How to read from a file and save the content into a linked list?
Question: 
                
I'm trying to write the code for a program that saves the content of a txt file into a singly linked list, every line in the txt file represent an object. I used Scanner to read from the file but I don't know how to get the words in the list. 

any tip or hint is highly appreciated.

my attempt: 

class Item 

public class Item implements Serializable {
private String name;
private double price;

public Item() {
name="" ; 
price=0.00 ;
}

public Item(String n, double p) {
name = n ; 
price = p ;
}

public void setName(String n) {
name = n ;
}

public void setPrice(double p) { price = p ;
}

public String getName() { 
return name ; 
}

public double getPrice() {
return price ;
}
}


class Node 

public class Node {
public Item data ;
public Node next ;

public Node(Item d) {
    data = d ;
}

public Node(Item d, Node n) {
    data = d ; 
    next = n ; 
}

public String toString() {
    return data+"";
}
}


class ListItems

public class ListItems {

private Node first;

public ListItems(){
    first=null;
}

public boolean isEmpty(){
    return first==null;
}

public void addAnItems(Item d, int i){
    Node node1=new Node(d);
    node1.next=first;
    first=items.get(i);
}

public void displayList(){
    Node current = first;

        while(current != null){
        System.out.println(current.toString());
        current=current.next;
        }
}
}


class FileItems

import java.io.* ;
import java.util.* ;

public class FileItems {
public static void main (String[]args){
Scanner input1=new Scanner(new File("items.txt"));

ListItems items=new ListItems();

while(input1.hasNextLine()){
    String line=input1.nextLine();
    System.out.println(line);
}

input1.close();

}
}


















































































