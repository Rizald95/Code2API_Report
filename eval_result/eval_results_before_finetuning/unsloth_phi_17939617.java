Title: How to get the execution directory path in java [duplicate]
Question: 
                    
            
        
            
                
                    
                            
                                This question already has answers here:
                                
                            
                    
                
            
                    
                        How to get the path of a running JAR file?
                            
                                (33 answers)
                            
                    
                    
                        How to get current working directory in Java?
                            
                                (8 answers)
                            
                    
                Closed 10 years ago.
        


    

I have made a pure java app which tells me about number of files in a given directory. Now I set current directory by using the following code:

`File f = new File(".");`


After that I made an installer with its jar file and installed it in my windows 8 and then I add it to the windows right click drop down menu (context menu). When I launch it from the context menu it always tells me about the number of files in the directory where it is actually installed in however I want to know the number of files of that directory from where I am executing it.

So plz help me. I am a novice in this field and I don't want you to confuse me in current directory and the current execution directory. So I write this so long and hoping for a clean answer in very simple words.

Thanks
    
Answer: 
As Jarrod Roberson states in his answer here:


  One way would be to use the system property
  System.getProperty("user.dir"); this will give you "The current
  working directory when the properties were initialized". This is
  probably what you want. to find out where the java command was
  issued, in your case in the directory with the files to process, even
  though the actual .jar file might reside somewhere else on the
  machine. Having the directory of the actual .jar file isn't that
  useful in most cases.
  
  The following will print out the current directory from where the
  command was invoked regardless where the .class or .jar file is
  located.
















































































































































