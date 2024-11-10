Title: how to prevent duplicates string in array and
Question: 
                
package jellyProblem;
import java.util.*;

public class jellyProblem   {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int studentNumbers = input.nextInt();
        input.nextLine();
        String [] name =new String [100];
        int [] volume=new int[100];

        while(true){
            if (studentNumbers==0)
                break ;
            else
            for(int i=0;i<studentNumbers;i++){
                name[i]=input.next();
                int length =input.nextInt();
                int width =input.nextInt();
                int height =input.nextInt();

                System.out.printf("\n%s %d %d %d\n",name[i],length,width,height);     
                volume[i]=length*height*width;                      
            }
            int minimum=0,maximum=0;
            for(int i=1;i<studentNumbers;++i){
                if (volume[i]<volume[minimum])
                    minimum=i;
                if (volume[i]>volume[maximum])
                    maximum=i;
            }
            if(volume[minimum]==volume[maximum])
                System.out.println("\nno child lost his jelly\n");
            else
                System.out.printf("\n%s has lost jelly to %s.\n",name[minimum],name[maximum]);
            studentNumbers = input.nextInt();
            input.nextLine();
        }

    }
}


First request I don't know how to:


Prevent string duplicates in names[] array like
I want to stop array  if characters of name[] is more than past (names[i].length<=10) it doesn't work with me 

    
Answer: 
Maybe you can do it like this:

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<String> names = new ArrayList<>();
    int studentNumbers = scanner.nextInt();
    scanner.nextLine();

    while (studentNumbers != 0) {
        String name = scanner.nextLine();
        if (name.length() > 10) {
            System.out.println("Name too long, please enter a name with 10 or fewer characters.");
            continue; // Skip the rest of the loop iteration
        }
        names.add(name);

        // ... (rest of your code)

        student