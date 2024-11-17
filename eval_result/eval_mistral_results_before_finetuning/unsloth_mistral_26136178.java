Title: how to split a string by ignoring the white space
Question: 
                
 public class TestBoolean { 

     public static void main(String[] args) { 

         String a = "13131300100 999 13131300200 999 13131300300 999 13131300400 999"; 

         String[] b = a.split("999"); 
         for (String c : b) { 
             System.out.println("Value\t:" + c); 
         } 

     } 
 } 


  
I need output as 

 13131300100 999 
 13131300200 999 
 13131300300 999 
 13131300400 999

    
Answer: 
For your example you could change your split regex to something like this:

String[] b = a.split("\\s(?!999)");


This will match:


first \\s - A whitespace character
(?!999) - not followed by 999.


Output:

Value   :13131300100 999
Value   :13131300200 999
Value   :13131300300 999
Value   :13131300400 999


The regex character classes can be found on the documentation for Pattern
    
Code: String[] b = a.split("\\s(?!999)");

Complete the code as a full Java method.

public class TestBoolean {

public static void main(String[] args) {

String a = "13131300100 999 13131300200 999 13131300300 999 13131300400 999";

String[] b = a.split("\\s(?!999)");
for (String c : b) {
System.out.println("Value\t:" + c);
}

}
}