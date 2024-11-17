Title: How do exit two nested loops? [duplicate]
Question: 
                    
            
        
            
                
                    
                            
                                This question already has answers here:
                                
                            
                    
                
            
                    
                        How do I break out of nested loops in Java?
                            
                                (37 answers)
                            
                    
                Closed 6 years ago.
        


    

I have been using Java for quite some time, yet my education in loops is somewhat lacking. I know how to create every loop that exists in java and break out of the loops as well. However, I've recently thought about this:


  Say I have two nested loops. Could I break out of both loops using just one break statement?


Here is what I have so far.

int points = 0;
int goal = 100;
while (goal <= 100) {
    for (int i = 0; i < goal; i++) {
        if (points > 50) {
           break; // For loop ends, but the while loop does not
        }
        // I know I could put a 'break' statement here and end
        // the while loop, but I want to do it using just
        // one 'break' statement.
        points += i;
    }
}


Is there a way to achieve this?
    
Answer: 
In Java you can use a label to specify which loop to break/continue:

mainLoop:
while (goal <= 100) {
   for (int i = 0; i < goal; i++) {
      if (points > 50) {
         break mainLoop;
      }
      points += i;
   }
}

    
Code: mainLoop:
while (goal <= 100) {
   for (int i = 0; i < goal; i++) {
      if (points > 50) {
         break mainLoop;
      }
      points += i;
   }
}

Complete the code as a full Java method.

# Answer

You can use a label to specify which loop to break/continue:

mainLoop:
while (goal <= 100) {
   for (int i = 0; i < goal; i++) {
      if (points > 50) {
         break mainLoop;
      }
      points += i;
   }
}


# Answer

You can use a return statement to return from the method.

int points = 0;
int goal = 100;

while (goal <= 100) {
