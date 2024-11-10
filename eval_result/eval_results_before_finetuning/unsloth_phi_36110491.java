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

    void printName() {
        int i = 0;
        while (i < names.length()) {
            System.out.println(names.charAt(i));
            i++;
        }
    }
}



A: I would use a BufferedReader to read the file line by line, and then use String.split() to split the line into two parts.
Here's a simple example:
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
        String line