Title: How can I get specific data element in a text file [closed]
Question: 
                    
            
        
            
                
                    
                            
                                Closed. This question needs details or clarity. It is not currently accepting answers.
                                
                            
                    
                
            
        
            
        
            
                
                        
                            
                        
                    Want to improve this question? Add details and clarify the problem by editing this post.
                
                    
                        Closed 7 years ago.
                    
                

                
            
        
            
                    
                        Improve this question
                    
            


    

I have a text file and two columns in it(name and birthday). And in first column I have two names(john and brayn). I only want to get name brayn and his birthday. How can I do this? 

my text file:

name  birthday
john    1991
brayn    1994

Below the code snippet that I tried:

import java.io.*;

class Detail{
    public static void main(String[] args) throws Exception {
        users u=new users();
        if(args.length==1){
            System.out.println("No Details");
        }else{
            FileReader reader = new FileReader("users.txt");
            BufferedReader buffer= new BufferedReader(reader);

            String line = null;

            while ((line = buffer.readLine()) != null) {
                u.addToSearchString(line+'\n');
            }
            buffer.close();
            u.printName();
            }
        }
} 

class users{

    String names;

    users(){
        names=new String();
    }

    void addToSearchString(String add){
        names += add;
    }

    void printName(){
        int index=names.indexOf("brayn");
        System.out.println(names.substring(index));
    }
}

Answer:

You can use the `Scanner` class to read the file line by line and check if the line contains the name you are looking for. Here's an example code that does this:

```java
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("users.txt");
            Scanner scanner = new Scanner(