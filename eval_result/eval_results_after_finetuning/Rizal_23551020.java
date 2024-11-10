Title: How to break a while loop from an if condition inside the while loop?
Question: 
                
I want to break a while loop of the format below which has an if statement. If that if statement is true, the while loop also must break. Any help would be appreciated.

while(something.hasnext()) {
   do something...
   if(contains something to process){
      do something
      break if condition and while loop
   }
}

    
Answer: 
The break keyword does exactly that. Here is a contrived example:

public static void main(String[] args) {
  int i = 0;
  while (i++ < 10) {
    if (i == 5) break;
  }
  System.out.println(i); //prints 5
}


If you were actually using nested loops, you would be able to use labels.
    
Code: public static void main(String[] args) {
  int i = 0;
  while (i++ < 10) {
    if (i == 5) break;
  }
  System.out.println(i); //prints 5
}

Complete the code as a full Java method.

# Answer

You can create a method in Java and use the break statement within the if condition as shown below:

public class BreakDemo {
   
    static int count() {
        int i = 0;
        while (i++ < 10) {
            if (i == 5) break;
        }
        System.out.println(i);
        return i;
    }
    
    public static void main(String[] args) {
        count();
    }
}

You can run the count method as a full Java method as shown above.

Alternatively, you can use a label with the break statement as