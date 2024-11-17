Title: How to write Fibonacci Java program without using if [closed]
Question: 
                    
            
        
            
                    
                        
                    
                
                    
                            
                                It's difficult to tell what is being asked here. This question is ambiguous, vague, incomplete, overly broad, or rhetorical and  cannot be reasonably answered in its current form. For help clarifying this question so that it can be reopened,  visit the help center.
                                
                            
                    
                
            
                Closed 10 years ago.
        


    

What is the code to write in int Fibonacci (int n) without using "if" like they did here Java recursive Fibonacci sequence ?
I tried to write this but it is wrong :
Because in this program the list will be 1 1 2 3 5 8 and not 0 1 1 2 3 5 8

Here is the program I tried to write:

public class Fibonacci
{
    public static void main(String[] args)
    {
        int f = 0;
        int g = 1;

        for(int i = 1; i <= 10; i++)
        {
            f = f + g;
            g = f - g;
            System.out.print(f + " ");
        }

        System.out.println();
    }
}

    
Answer: 
Your program is entirely correct; all you need to change is the location of the print statement:

public static void main(String[] args) {
  int f = 0;
  int g = 1;

  for(int i = 1; i <= 10; i++)
  {
    System.out.print(f + " ");
    f = f + g;
    g = f - g;
  } 

  System.out.println();
}


Alternatively, print g instead of f.
    
Code: public static void main(String[] args) {
  int f = 0;
  int g = 1;

  for(int i = 1; i <= 10; i++)
  {
    System.out.print(g + " ");
    f = f + g;
    g = f - g;
  }

  System.out.println();
}


Both programs will output: 0 1 1 2 3 5 8 13 21 34 55

The reason your original program was outputting incorrect results is because you were adding the current value of f to the previous value of g